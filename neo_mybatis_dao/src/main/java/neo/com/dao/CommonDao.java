package neo.com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("cmDao")
public class CommonDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int selectListCnt(String queryId, Object parameterObject){
		return sqlSession.selectOne("Board.selectBoardListCnt", parameterObject);
	}
	
	public <E> List<E> selectList(String queryId, Object parameterObject){
		return sqlSession.selectList("Board.selectBoardList", parameterObject);
	}
	
	public <T> T select(String queryId, int parameterInt){
		return sqlSession.selectOne("Board.selectBoard", parameterInt);
	}
	
	public <T> T select(String queryId, Object parameterObject){
		return sqlSession.selectOne("Board.selectBoard", parameterObject);
	}
	
	public int insert(String queryId, Object parameterObject){
		return sqlSession.insert("Board.insertBoard", parameterObject);
	}
	
	public int update(String queryId, Object parameterObject){
		return sqlSession.update("Board.updateBoard", parameterObject);
	}
	
}
