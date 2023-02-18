package shop.mtcoding.newblog.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reply {

    private int id;
    private String comment;
    private int userId;
    private int boardId;
    private Timestamp createdAt;
}
