package neo.apps.board.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class BoardDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Integer boardIdx;
	
	public String title;
	
	public String contents;
	
	public String displayYn;
	
	public int hitCnt;
	
	public String regId;
	
	public String regDate;

	public String modId;
	
	public String modDate;
}
