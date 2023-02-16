package shop.mtcoding.newblog.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mtcoding.newblog.dto.user.UserReq.JoinReqDto;

@Service
public class UserService {

    @Transactional
    public int 회원가입(JoinReqDto joinReqDto) {

        return -1;

    };
}
