package com.example.mytext;

public class MyUrl {
	public static String ARTICLE_SEARCH = "http://api.medsci.cn/medscinews/search?searchWord=%s&lastArticleId=%s";
	public static String REMOVE = "http://api.medsci.cn/medscinews/removeFromMyColection?token=%s&articleId=%s";
	public static String RECOMMEND = "http://api.medsci.cn/medscinews/getMyRecommend?token=%s&lastArticleId=%s";
	public static String FAVORITE_LIST = "http://api.medsci.cn/medscinews/getMyCollection?token=%s&lastArticleId=%s";
	public static String TITLE_LIST = "http://api.medsci.cn/medscinews/getNavList";
	public static String ARTICLE_LISTBYID = "http://api.medsci.cn/medscinews/NewsList?navId=%s&classid=%s";
	public static String LOAD_MOREARTICLE = "http://api.medsci.cn/medscinews/NewsList?navId=%s&classid=%s&lastArticleId=%s";
	public static String ADDTOFAV = "http://api.medsci.cn/medscinews/addToMyCollection?token=%s&articleId=%s";
	public static String EXIT = "http://api.medsci.cn/medscinews/logout?token=%s";
	public static String GETCOMMENT = "http://api.medsci.cn/medscinews/getArticleComment?articleId=%s&count_comment=%s&lastId=%s";
	public static String JIFEN = "http://api.medsci.cn/medscinews/qiandao_status?token=%s";
	public static String SCI_URL = "http://www.medsci.cn/api/medsci_api_1.0.php?url=journals_list&page=%s";
	public static String IMAGES = "http://www.medsci.cn/images/journalcover/%s.jpg";
	public static String SCI_CONTENT2 = "http://www.medsci.cn/api/medsci_api_1.0.php?url=journals_node_v2&&jid=%s&page=%s";
	public static String ZAN = "http://www.medsci.cn/sci/submit.do?action=good&id=e9857698&submit_id=%s";
	public static String MORE_REPLY = "http://www.medsci.cn/api/medsci_api_1.0.php?url=reply_list_v2&count=20&jid=%s&page=%s";
	public static String SEND_EX = "http://www.medsci.cn/api/medsci_api_1.0.php?url=post_reply";
	public static String XUEKE = "http://www.medsci.cn/api/medsci_api_1.0.php?url=classify";
	public static String XUEKECONTENT = "http://www.medsci.cn/api/medsci_api_1.0.php?url=journals_list&smallclass=%s";
	public static String ATICLE = "http://www.medsci.cn/api/medsci_api_1.0.php?url=paper_list&mzid=%s&page=%s";
	public static String ATICLECONTENT = "http://www.medsci.cn/api/medsci_api_1.0.php?url=paper_summary&pid=%s";
	public static String SCI_INTRODUCE = "http://www.medsci.cn/api/medsci_api_1.0.php?url=journals_profile&jid=%s";
	public static String SEARCH_URL = "http://www.medsci.cn/api/medsci_api_1.0.php?url=journals_list&search=%s&if_from=%s&if_to=%s&page=%s";
	public static String VEDIO_CATOGROY = "http://api.medsci.cn/edu-api.php/api/getCourseSeriesList";
	public static String VEDIO_LIST = "http://api.medsci.cn/edu-api.php/api/getSeriesList?series_id=%s&page=%s";
	public static String COURSE_INFO = "http://api.medsci.cn/edu-api.php/api/getCourseInfo?course_id=%s";
	public static String VIDEO_COM = "http://api.medsci.cn/edu-api.php/api/getCommentList?course_id=%s&page=%s";
	public static String ADD_VIDEO_COMMENT = "http://api.medsci.cn/edu-api.php/api/postComment";
	public static String REPLAY_COM = "http://api.medsci.cn/edu-api.php/api/postCommentReply";
	public static String GET_VIDEOPATH = "http://api.medsci.cn/edu-api.php/api/getVideoPath";
	public static String BUYCOURSE = "http://api.medsci.cn/edu-api.php/api/buyCourse";
	public static String CHECKVIDEOBUY = "http://api.medsci.cn/edu-api.php/api/checkVideoBuy";
	public static String ZIXUNCONTENT = "http://api.medsci.cn/medscinews/getArticle?articleId=%s";
	public static String LOGIN_IN = "http://api.medsci.cn/edu-api.php?c=medscinews&m=checkLogin";
	public static String JINGXUAN = "http://api.medsci.cn/medscinews/NewsList?searchWord=%s&page=%s";
	public static String JINGXUAN_ORDER="http://api.medsci.cn/medscinews/NewsList?orderby=comment_num&searchWord=%s&page=%s";
	public static String DAILY_DIGEST = "http://api.medsci.cn/medscinews/featuredDaily";
	public static String AD_IMAGE = "http://api.medsci.cn/medscinews/getAd";
	public static String LUNTAN_LIST = "http://api.medsci.cn/edu-api.php?d=interface&c=topic&m=index&pid=%s&uid=%s&page=%s&type=%s";
	public static String FUWU = "http://api.medsci.cn/edu-api.php/cate/index";
	public static String REMOVE_LUNTAN_COLLECTION = "http://api.medsci.cn/edu-api.php?d=interface&c=favorite&m=cancel_favorite&uid=%s&pid=%s";
	public static String ADD_LUNTAN_COLLECTION = "http://api.medsci.cn/edu-api.php?d=interface&c=favorite&m=add_favorite&uid=%s&pid=%s&type=2";
	public static String LUNTAN_CONTENT = "http://api.medsci.cn/edu-api.php?d=interface&c=article&id=%s&page=%s";
	public static String COLLECTION_TIEBA = "http://api.medsci.cn/edu-api.php?d=interface&c=favorite&m=info&uid=%s";
	public static String SENDMESSAGE = "http://api.medsci.cn/edu-api.php?d=interface&c=register&phone=%s";
	public static String REGISTER_URL = "http://api.medsci.cn/edu-api.php?d=interface&c=register&m=validation_info";
	public static String GETSENDTIEZI = "http://api.medsci.cn/edu-api.php?d=interface&c=topic&m=my_topic&uid=%s&page=%s";
	public static String POSTTOUXIANG = "http://api.medsci.cn/edu-api.php?d=interface&c=user&m=edit_info1";
	public static String ZHINAN_URL = "http://api.medsci.cn/medscinews/getHandbookList?page=%s";
	public static String BOUGHT_VIDEO = "http://api.medsci.cn/edu-api.php/api/getBuyHistory?uid=%s&token=%s";
	public static String CHANGLE_PERSONAL = "http://api.medsci.cn/edu-api.php?d=interface&c=user&m=update_info1";
	public static String GET_PERSONAL = "http://api.medsci.cn/edu-api.php?d=interface&c=user&m=get_info&uid=%s";
	public static String POST_BIANQIAN = "http://api.medsci.cn/edu-api.php?d=interface&c=user&m=insert_label&label=%s&uid=%s";
	public static String GETREPLY_TIEZI = "http://api.medsci.cn/edu-api.php?d=interface&c=reply&m=my_reply&uid=%s";
	public static String GUANZHU = "http://api.medsci.cn/edu-api.php?d=interface&c=user&m=follow_iphone";
	public static String GUANZHU_LIST = "http://api.medsci.cn/edu-api.php?d=interface&c=user&m=follow_info&uid=%s";
	public static String REMOVE_GUANZHU = "http://api.medsci.cn/edu-api.php?d=interface&c=user&m=cancel_follow&uid=%s&tid=%s";
	public static String TUIJIAN_LUNTAN = "http://api.medsci.cn/edu-api.php?d=interface&c=user&m=recommend&uid=%s";
	public static String GET_GUANZHU = "http://api.medsci.cn/edu-api.php?d=interface&c=user&m=get_follow&uid=%s&tid=%s";
	public static String FENLEI_ZHINAN="http://api.medsci.cn/medscinews/getHandbookList?subject_id=%s&page=%s";
	public static String FIND_MIMA = "http://api.medsci.cn/edu-api.php?d=interface&c=register&m=find_my_password";
	public static String NEW_COURSE="http://api.medsci.cn/edu-api.php/api/getCourseList?page=%s";
	public static String GET_LINCHUANG="http://api.medsci.cn/edu-api.php?d=interface&c=speciality&m=get_label&s_type=0&type=0";
	public static String GET_YANJIU="http://api.medsci.cn/edu-api.php?d=interface&c=speciality&m=get_label&s_type=1&type=0";
	public static String ADD_NEW_COURSE="http://api.medsci.cn/edu-api.php/api/addToMyCourseList";
	public static String REMOVE_NEW_COURSE="http://api.medsci.cn/edu-api.php/api/removeToMyCourseList";
	public static String GET_NEW_COURSE="http://api.medsci.cn/edu-api.php/api/getMyCourseList";
	public static String CHECK_QIANDAO="http://api.medsci.cn/medscinews/qiandao_status";
	public static String QIANDAO="http://api.medsci.cn/medscinews/qiandao_act";
	public static String SENDTAG="http://api.medsci.cn/edu-api.php?d=interface&c=speciality&m=edit_speciality";
	public static String GETTAG="http://api.medsci.cn/edu-api.php?d=interface&c=speciality&m=my_speciality_info&uid=%s&type=%s";
	public static String BIAOQIAN="http://api.medsci.cn/edu-api.php?d=interface&c=speciality&m=get_speciality&uid=%s";
	public static String ss="http://api.medsci.cn/edu-api.php?d=interface&c=speciality&m=update_speciality";
	public static String GETTAG_FRIEND="http://api.medsci.cn/edu-api.php?d=interface&c=speciality&m=recommend&sid=%s&uid=%s";
}
