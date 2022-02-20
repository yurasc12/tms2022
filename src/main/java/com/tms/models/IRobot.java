package com.tms.models;

public interface IRobot {
    void action();

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    int getPrice();
}
