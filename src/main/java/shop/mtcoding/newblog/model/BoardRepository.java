package shop.mtcoding.newblog.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import shop.mtcoding.newblog.dto.board.BoardResp.BoardDetailRespDto;
import shop.mtcoding.newblog.dto.board.BoardResp.BoardMainRespDto;

@Mapper
public interface BoardRepository {

        public List<Board> findAll();

        public Board findById(int id);

        public int insert(@Param("title") String title, @Param("content") String content,
                        @Param("thumbnail") String thumbnail,
                        @Param("userId") int userId);

        public int updateById(@Param("id") int id, @Param("title") String title,
                        @Param("content") String content, @Param("thumbnail") String thumbnail);

        public int deleteById(int id);

        public List<BoardMainRespDto> findAllWithUser();

        public BoardDetailRespDto findByIdWithUser(int id);
}