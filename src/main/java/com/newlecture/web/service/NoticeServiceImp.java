package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;

@Service
public class NoticeServiceImp implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;	
	
	@Override
		public Notice get(int id) {
			Notice notice = noticeDao.get(id);
			return notice;
		}
		
		@Override
		public List<Notice> getList() {
			List<Notice> list = noticeDao.getList();
			return list;
		}
}
