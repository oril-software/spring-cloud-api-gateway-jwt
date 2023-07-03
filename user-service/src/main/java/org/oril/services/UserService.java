package org.oril.services;

import lombok.AllArgsConstructor;
import org.oril.entities.UserVO;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class UserService {

    public UserVO save(UserVO userVO) {
        //simulate save operation;
        String userId = String.valueOf(new Date().getTime());
        userVO.setId(userId);
        userVO.setRole("USER");
        //save user
        return userVO;
    }

}
