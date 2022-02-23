package com.tms.models;


import lombok.Getter;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
public class ErrorAuthorization {
    private String login;
    private String password;
    private final String confirmPassword;
    ArrayList<String> errors = new ArrayList<>();

    public ErrorAuthorization(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    // если 2 исключения одинакового приоритета срабатывае первое вторе не проверяется
    public boolean checkAuthorization() {
        try {
            if (checkPassword() && checkLogin()) {
                return true;
            }
        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());
        }
        return false;
    }

    private boolean checkPassword() throws WrongPasswordException {
        password = password.trim();
        String result = "";
        if (checkString(password) && password.equals(confirmPassword) && password.length() < 20) {
            return true;
        } else {
            if (!checkString(password)) {
                errors.add("Пароль должен содержать только цифры и латиницу!!!");
            }
            if (password.length() > 20) {
                errors.add("Длина пароля не должна превышать 20 симврлов !!!");
            }
            if (!password.equals(confirmPassword)) {
                errors.add("Пароль и подтверждение не совпадают");
            }
            throw new WrongPasswordException("не верный пароль!!!");
        }
    }


    private boolean checkLogin() throws WrongLoginException {
        login = login.trim();
        String result = "";
        if (checkString(login) && login.length() < 20) {
            return true;
        } else {
            if (!checkString(login)) {
                errors.add("Login должен содержать только цифры и латиницу!!!");
            }
            if (login.length() > 20) {
                errors.add("Длина Logina не должна превышать 20 симврлов !!!");
            }
            throw new WrongLoginException("Неверный логин!!!");
        }
    }

    private boolean checkString(String value) {
        String regex = "[A-Za-z0-9+_]+";
        value = value.trim();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}