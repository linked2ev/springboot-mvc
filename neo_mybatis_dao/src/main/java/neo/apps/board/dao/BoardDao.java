package neo.apps.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import neo.apps.board.dto.BoardDto;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int selectBoardListCnt(BoardDto boardDto){
		return sqlSession.selectOne("Board.selectBoardListCnt", boardDto);
	}
	
	public List<BoardDto> selectBoardList(BoardDto boardDto){
		return sqlSession.selectList("Board.selectBoardList", boardDto);
	}
	
	public BoardDto selectBoard(int boardIdx){
		return sqlSession.selectOne("Board.selectBoard", boardIdx);
	}
	
	public int insertBoard(BoardDto boardDto){
		return sqlSession.insert("Board.insertBoard", boardDto);
	}
	
	public int updateBoard(BoardDto boardDto){
		return sqlSession.update("Board.updateBoard", boardDto);
	}
	
}
