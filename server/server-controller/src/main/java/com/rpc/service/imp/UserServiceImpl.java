package com.rpc.service.imp;

import com.dto.User;
import com.model.Result;
import com.rpc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl  implements UserService {


	@Override
	public Result login(String ip, String account, String password) {
		return null;
	}

	@Override
	public void enable(Boolean isEnable, List<Integer> idList) {

	}

	@Override
	public void resetPassword(String password, List<Integer> idList) {

	}

	@Override
	public User findByAccount(String account) {
		return null;
	}

	@Override
	public void updatePassword(Integer id, String newPassword) {

	}

	@Override
	public void save(User user, List<Integer> roleIdList) {

	}
}
