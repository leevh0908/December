package cn.com.taiji.controller;

import cn.com.taiji.domain.Blog;
import cn.com.taiji.domain.ChatTeam;
import cn.com.taiji.domain.Comment;
import cn.com.taiji.domain.UserInfo;
import cn.com.taiji.repository.BlogRepository;
import cn.com.taiji.repository.ChatTeamRepository;
import cn.com.taiji.repository.CommentReposity;
import cn.com.taiji.repository.UserInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iandtop on 2018/12/11.
 */
@Controller
public class HelloController {






}
