package com.yash.eshop.service;

import java.util.List;

import com.yash.eshop.model.UserDtls;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

	public UserDtls saveUser(UserDtls user,boolean isSeller);

	public UserDtls getUserByEmail(String email);

	public List<UserDtls> getUsers(String role);

	public Boolean updateAccountStatus(Integer id, Boolean status);

	public void increaseFailedAttempt(UserDtls user);

	public void userAccountLock(UserDtls user);

	public boolean unlockAccountTimeExpired(UserDtls user);

	public void resetAttempt(int userId);

	public void updateUserResetToken(String email, String resetToken);

	public UserDtls getUserByToken(String token);

	public UserDtls updateUser(UserDtls user);

	public UserDtls updateUserProfile(UserDtls user, MultipartFile img);

	public UserDtls saveAdmin(UserDtls user);

	public Boolean existsEmail(String email);

}
