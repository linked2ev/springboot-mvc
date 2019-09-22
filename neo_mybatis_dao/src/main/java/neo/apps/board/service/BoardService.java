package neo.apps.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import neo.apps.board.dto.BoardDto;

public interface BoardService {

	public int selectBoardListCnt(HttpServletRequest request, BoardDto boardDto) throws Exception;

	public List<BoardDto> selectBoardList(HttpServletRequest request, BoardDto boardDto) throws Exception;
	
	public BoardDto selectBoard(HttpServletRequest request, int boardIdx) throws Exception;
	
	public int insertBoard(HttpServletRequest request, BoardDto boardDto) throws Exception;
	
	public int updateBoard(HttpServletRequest request, BoardDto boardDto) throws Exception;
}