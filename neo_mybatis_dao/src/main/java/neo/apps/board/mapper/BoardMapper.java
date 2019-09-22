package neo.apps.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import neo.apps.board.dto.BoardDto;

@Mapper
public interface BoardMapper {
	
	int selectBoardListCnt(BoardDto boardDto) throws Exception;
	
	List<BoardDto> selectBoardList(BoardDto boardDto) throws Exception;
	
	BoardDto selectBoard(int boardIdx) throws Exception;
	
	void insertBoard(BoardDto boardDto) throws Exception;
	
	void updateBoard(BoardDto boardDto) throws Exception;
}