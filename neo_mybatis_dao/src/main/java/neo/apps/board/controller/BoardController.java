package neo.apps.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import neo.apps.board.dto.BoardDto;
import neo.apps.board.service.BoardService;
import neo.com.util.Util;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping("list")
	public ModelAndView noticeList(HttpServletRequest request, BoardDto boardDto) throws Exception {
		ModelAndView mv = new ModelAndView();
		log.info("## noticeList");
		
		// 목록 갯수
		int totalCnt = this.boardService.selectBoardListCnt(request, boardDto);
		
		// 목록
		List<BoardDto> list = null;
		if(totalCnt > 0){
			list = this.boardService.selectBoardList(request, boardDto);
		}
		mv.addObject("totalCnt", totalCnt);
		mv.addObject("list", list);
		mv.addObject("boardDto", boardDto);
		
		return mv;
	}
	
	@RequestMapping("detail")
	public ModelAndView noticeDetail(HttpServletRequest request, @RequestParam Integer boardIdx) throws Exception {
		ModelAndView mv = new ModelAndView();
		log.info("## noticeDetail");
		
		// 상세
		BoardDto detail = this.boardService.selectBoard(request, boardIdx);
		mv.addObject("detail", detail);
		
		return mv;
	}
	
	@RequestMapping("form")
	public ModelAndView noticeForm(HttpServletRequest request, @RequestParam Integer boardIdx) throws Exception {
		ModelAndView mv = new ModelAndView();
		log.info("## noticeForm");
		
		BoardDto detail = new BoardDto();
		
		if (boardIdx != null) {
			// 상세
			detail = this.boardService.selectBoard(request, boardIdx);
		}
		mv.addObject("detail", detail);
		
		return mv;
	}
	
	@RequestMapping(value="formProc", method=RequestMethod.POST)
	@ResponseBody
	public String noticeFormProc(HttpServletRequest request, @ModelAttribute BoardDto boardDto) throws Exception {
		JSONObject rData = new JSONObject();
		
		boardDto.setDisplayYn(Util.getStr(boardDto.getDisplayYn(), "N"));
		log.info("## noticeFormProc boardDto: " + boardDto);
		
		if (boardDto.getBoardIdx() == null) {
			int bb = this.boardService.insertBoard(request, boardDto);
			rData.put("rMsg", "정상적으로 등록했습니다.");
		} else {
			int aa = this.boardService.updateBoard(request, boardDto);
			rData.put("rMsg", "정상적으로 수정했습니다.");
		}
		
		return rData.toString();
	}
}