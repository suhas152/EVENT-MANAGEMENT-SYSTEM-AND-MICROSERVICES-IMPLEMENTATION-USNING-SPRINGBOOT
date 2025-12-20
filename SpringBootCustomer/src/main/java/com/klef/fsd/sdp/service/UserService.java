package com.klef.fsd.sdp.service;

import java.util.List;

import com.klef.fsd.sdp.model.UserModel;

public interface UserService {
public String addUser(UserModel user);

public String updateUser(UserModel user);

public String deleteUser(int uid);

public List<UserModel> displayAllUsers();

public UserModel displayByid(int uid);
}
