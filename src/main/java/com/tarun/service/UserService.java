package com.tarun.service;

import com.tarun.bindings.DashboardCard;
import com.tarun.bindings.LoginForm;
import com.tarun.bindings.UserAccForm;

public interface UserService {

    public String login(LoginForm loginForm);

    public boolean recoverPwd(String email);

    public DashboardCard fetchDashboardInfo();
    
    public UserAccForm getUserByEmail(String email);

}
