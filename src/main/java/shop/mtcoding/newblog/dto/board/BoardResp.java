package shop.mtcoding.newblog.dto.board;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

public class BoardResp {

    @Getter
    @Setter
    public static class BoardMainRespDto {
        private int id;
        private String title;
        private String username;
    }

    @Setter
    @Getter
    public static class BoardDetailRespDto {
        private int id;
        private String title;
        private String content;
        private int userId;
        private String username;
    }
}
