/**
 * @apiDefine error 错误码含义
 */
/**
 * @apiDefine ret 返回值
 */
/**
 * @apiDefine par 请求参数
 */
 
/**
 * @apiDefine actcondition
 *
 * @apiParam (par){string} school 学校id（可选）
 * @apiParam (par){string} gender 用户性别，1为男，2为女（可选）
 * @apiParam (par){string} grade 年级id（可选）
 * @apiParam (par){string} type 活动类型id（可选）
 * @apiParam (par){string} num 限制人数最大值（可选）
 */
 
/**
 * @api {POST} login 用户登录
 * @apiVersion 1.0.0
 * @apiName login
 * @apiGroup User
 *
 * @apiParam (par){string} mail 用户邮箱
 * @apiParam (par){string} pwd 用户密码
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){json} data 数据
 * @apiParam (ret){string} data.token 用户标识
 * @apiParam (ret){json} data.user 用户
 * @apiParam (ret){string} data.user.id 用户id
 * @apiParam (ret){string} data.user.mail 用户邮箱
 * @apiParam (ret){string} data.user.password 用户密码
 * @apiParam (ret){string} data.user.realname 用户真实姓名
 * @apiParam (ret){string} data.user.phone 用户电话
 * @apiParam (ret){string} data.user.nickname 用户昵称
 * @apiParam (ret){string} data.user.interest 用逗号隔开的兴趣id
 * @apiParam (ret){int} data.user.gender 用户性别，1为男，2为女
 * @apiParam (ret){int} data.user.school 用户学校id
 * @apiParam (ret){string} data.user.department 用户院系
 * @apiParam (ret){int} data.user.grade 用户年级id
 * @apiParam (ret){string} data.user.headimg 用户头像url，不含网站前缀
 * @apiParam (ret){int} data.user.privilege 用户权限值
 * @apiParam (ret){int} data.user.role 用户角色id
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "登录成功",
 * 	data: {
 *  	token: "leelio7412i7",
 *		user: {
 *			id: 1,
 * 			mail: "2@2.com",
 *			password: "123",
 *			realname: "real",
 *			phone: "123",
 *			nickname: "name",
 *			interest: "2,3",
 *			gender: 1,
 *			school: 1,
 *			department: "123",
 *			grade: 1,
 *			headimg: "head",
 *			privilege: 7,
 *			role: 2
 *		}
 *	}
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 203 用户名错误
 * @apiParam (error){int} 204 密码错误
 *
 */
 
 /**
 * @api {POST} logout 用户登出
 * @apiVersion 1.0.0
 * @apiName logout
 * @apiGroup User
 *
 * @apiParam (par){string} token 用户标识
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "注销成功"
 *}
 *
 * @apiParam (error){int} 100 参数错误
 */
 
 /**
 * @api {POST} mailcheck 注册邮箱检查
 * @apiVersion 1.0.0
 * @apiName mailcheck
 * @apiGroup User
 *
 * @apiParam (par){string} mail 用户邮箱
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "注册邮箱可用"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 200 注册邮箱重复
 * @apiParam (error){int} 201 邮箱格式错误
 */
 
 /**
 * @api {POST} nickcheck 注册昵称检查
 * @apiVersion 1.0.0
 * @apiName nickcheck
 * @apiGroup User
 *
 * @apiParam (par){string} nickname 用户昵称
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "注册昵称可用"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 202 注册昵称重复
 */
 
 /**
 * @api {POST} reg 用户注册
 * @apiVersion 1.0.0
 * @apiName reg
 * @apiGroup User
 *
 * @apiParam (par){string} mail 用户邮箱
 * @apiParam (par){string} password 用户密码
 * @apiParam (par){string} nickname 用户昵称
 * @apiParam (par){string} interest 用户兴趣，用逗号分割的兴趣id
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "注册成功"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 103 注册失败
 */
 
 /**
 * @api {POST} admin/reg 管理员注册
 * @apiVersion 1.0.0
 * @apiName adminreg
 * @apiGroup User
 *
 * @apiParam (par){string} mail 管理员邮箱
 * @apiParam (par){string} password 管理员密码
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "注册成功"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 103 注册失败
 */
 
 /**
 * @api {POST} user/my/manage 个人信息修改
 * @apiVersion 1.0.0
 * @apiName managemy
 * @apiGroup User
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} mail 邮箱（可选）
 * @apiParam (par){string} password 密码（可选）
 * @apiParam (par){string} realname 真实姓名（可选）
 * @apiParam (par){string} phone 电话（可选）
 * @apiParam (par){string} nickname 昵称（可选）
 * @apiParam (par){string} interest 兴趣（可选）
 * @apiParam (par){int} gender 性别，1为男，2为女（可选）
 * @apiParam (par){int} school 学校（可选）
 * @apiParam (par){string} department 院系密码（可选）
 * @apiParam (par){int} grade 年级（可选）
 * @apiParam (par){string} stunum 学号（可选）
 * @apiParam (par){string} headimg 头像地址（可选）
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "修改成功"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 102 用户未登录 
 */
 
 /**
 * @api {POST} admin/role 更改用户角色
 * @apiVersion 1.0.0
 * @apiName managerole
 * @apiGroup User
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} id 用户id
 * @apiParam (par){string} role 新角色id
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "修改成功"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 101 用户无权限
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 400 用户不存在 
 */
 
 /**
 * @api {POST} msg/publish 发布留言
 * @apiVersion 1.0.0
 * @apiName msgpublish
 * @apiGroup Message
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} actid 活动id
 * @apiParam (par){string} content 留言内容
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){int} data 留言id
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: 1
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 101 用户无权限
 * @apiParam (error){int} 102 用户未登录 
 */
 
 /**
 * @api {POST} msg/list 查看活动留言
 * @apiVersion 1.0.0
 * @apiName msglist
 * @apiGroup Message
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} actid 活动id
 * @apiParam (par){string} offset 留言条目偏移量
 * @apiParam (par){string} limit 留言条目数
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){json[]} data 数据
 * @apiParam (ret){int} data.id 留言id
 * @apiParam (ret){int} data.uid 留言人id
 * @apiParam (ret){string} data.content 留言内容
 * @apiParam (ret){string} data.date 留言日期
 * @apiParam (ret){json} data.author 留言者
 * @apiParam (ret){int} data.author.id 留言者id
 * @apiParam (ret){string} data.author.head 留言者头像
 * @apiParam (ret){string} data.author.name 留言者姓名
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: [{
 *		id: 3,
 * 		actid: 1,
 *		uid: 1,
 *		content: "content",
 *		date: "2014-11-23 17:05:00.0",
 *		author: 
 *		{
 *			id: 1,
 * 			head: "head",
 *			name: "name"
 *		}
 *	}]
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 500 指定范围查找不到内容
 */
 
 /**
 * @api {POST} msg/my/list 查看个人所有留言
 * @apiVersion 1.0.0
 * @apiName msgmylist
 * @apiGroup Message
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} offset 留言条目偏移量
 * @apiParam (par){string} limit 留言条目数
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){json[]} data 数据
 * @apiParam (ret){int} data.id 留言id
 * @apiParam (ret){int} data.actid 活动id
 * @apiParam (ret){string} data.content 留言内容
 * @apiParam (ret){string} data.date 留言日期
 * @apiParam (ret){json} data.activity 留言活动
 * @apiParam (ret){int} data.activity.title 活动标题

 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: [{
 *		id: 3,
 * 		actid: 1,
 *		uid: 1,
 *		content: "content",
 *		date: "2014-11-23 17:05:00.0",
 *		activity: 
 *		{
 * 			title: "title"
 *		}
 *	}]
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 500 指定范围查找不到内容
 */
 
 /**
 * @api {POST} activity/publish 发布活动
 * @apiVersion 1.0.0
 * @apiName actpublish
 * @apiGroup Activity
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} title 活动标题
 * @apiParam (par){string} starttime 活动开始时间
 * @apiParam (par){string} endtime 活动结束时间
 * @apiParam (par){string} applytime 申请截止时间
 * @apiParam (par){string} numlimit 人数限制
 * @apiParam (par){string} address 活动地址
 * @apiParam (par){string} fee 活动费用（整数）
 * @apiParam (par){string} benefit 活动益处
 * @apiParam (par){string} feature 活动特点
 * @apiParam (par){string} description 其他描述
 * @apiParam (par){string} type 活动类型id
 * @apiParam (par){string} schoollimit 学校限制id
 * @apiParam (par){string} gradelimit 年级限制id
 * @apiParam (par){string} genderlimit 性别限制，1为男，2为女
 * @apiParam (par){string} contact 联系方式
 * @apiParam (par){string} image 活动图片
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){int} data 活动id
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: 1
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 101 用户无权限
 * @apiParam (error){int} 102 用户未登录 
 */
 
 /**
 * @api {POST} activity/list/new 查看最新活动
 * @apiVersion 1.0.0
 * @apiName actlistnew
 * @apiGroup Activity
 *
 * @apiUse actcondition
 * @apiParam (par){string} offset 条目偏移量
 * @apiParam (par){string} limit 条目数
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){json[]} data 活动
 * @apiParam (ret){int} data.id 活动id
 * @apiParam (ret){string} data.image 活动图片地址
 * @apiParam (ret){string} data.title 活动标题
 * @apiParam (ret){string} data.acttime 活动发布时间
 * @apiParam (ret){int} data.applynum 参加数
 * @apiParam (ret){int} data.collectnum 活动收藏数
 * @apiParam (ret){int} data.watchnum 活动查看数
 * @apiParam (ret){string} data.description 活动描述
 * @apiParam (ret){json} data.author 发布者
 * @apiParam (ret){int} data.author.id 发布者id
 * @apiParam (ret){string} data.author.head 发布者头像
 * @apiParam (ret){string} data.author.name 发布者姓名
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: [{
 *		id: 1,
 *		image: "head",
 *		title: "content",
 *		acttime: "2014-11-10 23:41:50.0",
 *		applynum: 1,
 *		collectnum: 0,
 *		watchnum: 7,
 *		description: "description",
 *		author: 
 *		{
 *			id: 1,
 *			head: "head",
 *			name: "name"
 *		}
 *	}]
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 500 指定范围查找不到内容
 */
 
 /**
 * @api {POST} activity/list/suggest 查看推荐活动
 * @apiVersion 1.0.0
 * @apiName actlistsuggest
 * @apiGroup Activity
 *
 * @apiUse actcondition
 * @apiParam (par){string} offset 条目偏移量
 * @apiParam (par){string} limit 条目数
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){json[]} data 活动
 * @apiParam (ret){int} data.id 活动id
 * @apiParam (ret){string} data.image 活动图片地址
 * @apiParam (ret){string} data.title 活动标题
 * @apiParam (ret){string} data.acttime 活动发布时间
 * @apiParam (ret){int} data.applynum 参加数
 * @apiParam (ret){int} data.collectnum 活动收藏数
 * @apiParam (ret){int} data.watchnum 活动查看数
 * @apiParam (ret){string} data.description 活动描述
 * @apiParam (ret){json} data.author 发布者
 * @apiParam (ret){int} data.author.id 发布者id
 * @apiParam (ret){string} data.author.head 发布者头像
 * @apiParam (ret){string} data.author.name 发布者姓名
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: [{
 *		id: 1,
 *		image: "head",
 *		title: "content",
 *		acttime: "2014-11-10 23:41:50.0",
 *		applynum: 1,
 *		collectnum: 0,
 *		watchnum: 7,
 *		description: "description",
 *		author: 
 *		{
 *			id: 1,
 *			head: "head",
 *			name: "name"
 *		}
 *	}]
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 500 指定范围查找不到内容
 */
 
 /**
 * @api {POST} activity/list/hot 查看最热活动
 * @apiVersion 1.0.0
 * @apiName actlisthot
 * @apiGroup Activity
 *
 * @apiUse actcondition
 * @apiParam (par){string} offset 条目偏移量
 * @apiParam (par){string} limit 条目数
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){json[]} data 活动
 * @apiParam (ret){int} data.id 活动id
 * @apiParam (ret){string} data.image 活动图片地址
 * @apiParam (ret){string} data.title 活动标题
 * @apiParam (ret){string} data.acttime 活动发布时间
 * @apiParam (ret){int} data.applynum 参加数
 * @apiParam (ret){int} data.collectnum 活动收藏数
 * @apiParam (ret){int} data.watchnum 活动查看数
 * @apiParam (ret){string} data.description 活动描述
 * @apiParam (ret){json} data.author 发布者
 * @apiParam (ret){int} data.author.id 发布者id
 * @apiParam (ret){string} data.author.head 发布者头像
 * @apiParam (ret){string} data.author.name 发布者姓名
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: [{
 *		id: 1,
 *		image: "head",
 *		title: "content",
 *		acttime: "2014-11-10 23:41:50.0",
 *		applynum: 1,
 *		collectnum: 0,
 *		watchnum: 7,
 *		description: "description",
 *		author: 
 *		{
 *			id: 1,
 *			head: "head",
 *			name: "name"
 *		}
 *	}]
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 500 指定范围查找不到内容
 */
 
 /**
 * @api {POST} activity/detail 查看活动详情
 * @apiVersion 1.0.0
 * @apiName actdetail
 * @apiGroup Activity
 *
 * @apiParam (par){string} id 活动id
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){json[]} data 活动信息
 * @apiParam (ret){string} data.title 活动标题
 * @apiParam (ret){string} data.acttime 活动发布时间
 * @apiParam (ret){string} data.starttime 活动开始时间
 * @apiParam (ret){string} data.endtime 活动结束时间
 * @apiParam (ret){string} data.applytime 申请截止时间
 * @apiParam (ret){int} data.numlimit 人数限制
 * @apiParam (ret){string} data.address 活动地址
 * @apiParam (ret){int} data.fee 活动费用
 * @apiParam (ret){string} data.benefit 活动益处
 * @apiParam (ret){string} data.feature 活动特点
 * @apiParam (ret){string} data.description 其他描述
 * @apiParam (ret){int} data.type 活动类型id
 * @apiParam (ret){int} data.schoollimit 学校限制id
 * @apiParam (ret){int} data.gradelimit 年级限制id
 * @apiParam (ret){int} data.genderlimit 性别限制，1为男，2为女
 * @apiParam (ret){string} data.contact 联系方式
 * @apiParam (ret){string} data.image 活动图片
 * @apiParam (ret){int} data.status 活动状态
 * @apiParam (ret){int} data.collectnum 收藏数
 * @apiParam (ret){int} data.applynum 参加数
 * @apiParam (ret){int} data.watchnum 查看数
 * @apiParam (ret){int} data.hotvalue 热度值
 * @apiParam (ret){json} data.author 发布者
 * @apiParam (ret){int} data.author.id 发布者id
 * @apiParam (ret){string} data.author.head 发布者头像
 * @apiParam (ret){string} data.author.name 发布者姓名
 * @apiParam (ret){json[]} data.candidate 参加情况
 * @apiParam (ret){int} data.candidate.id 申请id
 * @apiParam (ret){int} data.candidate.status 申请状态，2的时候为未处理，1为通过，0为拒绝
 * @apiParam (ret){string} data.candidate.date 申请时间
 * @apiParam (ret){json} data.candidate.author 参加者
 * @apiParam (ret){int} data.candidate.author.id 参加者id
 * @apiParam (ret){string} data.candidate.author.head 参加者头像
 * @apiParam (ret){string} data.candidate.author.name 参加者姓名
 *
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: {
 *		id: 1,
 *		title: "23333",
 *		acttime: "2014-11-10 23:41:50.0",
 *		starttime: "2014-11-10 00:00:00.0",
 *		endtime: "2014-11-10 00:00:00.0",
 *		applytime: "2014-11-10 00:00:00.0",
 *		numlimit: 10,
 *		address: "222",
 *		fee: 0,
 *		benefit: "222",
 *		feature: "222",
 *		description: "description",
 *		type: 2,
 *		schoollimit: 2,
 *		gradelimit: 3,
 *		genderlimit: 1,
 *		contact: "222",
 *		image: "head",
 *		status: 1,
 *		collectnum: 0,
 *		applynum: 1,
 *		watchnum: 7,
 *		hotvalue: 0,
 *		candidate: [{
 *			id: 2,
 *			status: 2,
 *			date: "2014-11-24 20:49:38.0",
 *			author: {
 *				id: 1,
 *				head: "head",
 *				name: "name"
 *			}
 *		}],
 *		author: {
 *			id: 1,
 *			head: "head",
 *			name: "name"
 *		}
 *	}
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 500 指定范围查找不到内容
 */
 
/**
 * @api {POST} activity/my/checkcollect 是否收藏活动
 * @apiVersion 1.0.0
 * @apiName actcollectcheck
 * @apiGroup Activity
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} id 活动id
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){int} data 已收藏／未收藏
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: "已收藏"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 102 用户未登录 
 */
 
/**
 * @api {POST} apply/action/add 申请参加活动
 * @apiVersion 1.0.0
 * @apiName applyadd
 * @apiGroup Activity
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} activity 活动id
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){int} data 申请id
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: 1
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 101 用户无权限s
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 600 已经申请参加 
 */
 
 /**
 * @api {POST} apply/action/del 取消申请
 * @apiVersion 1.0.0
 * @apiName applydel
 * @apiGroup Activity
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} activity 活动id
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){int} data 申请id
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 101 用户无权限
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 500 用户未申请参加
 */
 
 /**
 * @api {POST} apply/action/check 申请审核
 * @apiVersion 1.0.0
 * @apiName applycheck
 * @apiGroup Activity
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} id 申请id
 * @apiParam (par){string} check 0为拒绝申请，1为同意申请
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 101 用户无权限
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 500 申请不存在
 */
 
 /**
 * @api {POST} apply/action/list 查看本人所有申请
 * @apiVersion 1.0.0
 * @apiName applylist
 * @apiGroup Activity
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} offset 条目偏移量
 * @apiParam (par){string} limit 条目数
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){json[]} data 申请
 * @apiParam (ret){int} data.id 申请id
 * @apiParam (ret){int} data.status 申请状态，2的时候为未处理，1为通过，0为拒绝
 * @apiParam (ret){string} data.date 申请日期
 * @apiParam (ret){json} data.activity 申请活动
 * @apiParam (ret){int} data.activity.id 活动id
 * @apiParam (ret){string} data.activity.image 活动图片
 * @apiParam (ret){string} data.activity.title 活动标题
 * @apiParam (ret){string} data.activity.description 其他描述
 * @apiParam (ret){string} data.activity.acttime 活动发布时间
 * @apiParam (ret){int} data.activity.collectnum 收藏数
 * @apiParam (ret){int} data.activity.applynum 参加数
 * @apiParam (ret){int} data.activity.watchnum 查看数
 * @apiParam (ret){json} data.activity.author 发布者
 * @apiParam (ret){int} data.activity.author.id 发布者id
 * @apiParam (ret){string} data.activity.author.head 发布者头像
 * @apiParam (ret){string} data.activity.author.name 发布者姓名
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: [{
 *		id: 2,
 *		date: "2014-11-24 20:49:38.0",
 *		activity: {
 *			id: 1,
 *			status: 2,
 *			image: "head",
 *			title: "23333",
 *			acttime: "2014-11-10 23:41:50.0",
 *			applynum: 1,
 *			collectnum: 0,
 *			watchnum: 8,
 *			description: "description",
 *			author: {
 *				id: 1,
 *				head: "head",
 *				name: "name"
 *			}
 *		}
 *	}]
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 600 已经申请参加 
 */
 
 /**
 * @api {POST} collect/my/add 收藏活动
 * @apiVersion 1.0.0
 * @apiName collectadd
 * @apiGroup Activity
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} activity 活动id
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){int} data 收藏id
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: 1
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 600 已经收藏 
 */
 
 /**
 * @api {POST} collect/my/del 取消收藏
 * @apiVersion 1.0.0
 * @apiName collectdel
 * @apiGroup Activity
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} activity 活动id
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){int} data 申请id
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 500 用户未收藏
 */
 
 /**
 * @api {POST} collect/my/list 查看本人所有收藏
 * @apiVersion 1.0.0
 * @apiName collectlist
 * @apiGroup Activity
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} offset 条目偏移量
 * @apiParam (par){string} limit 条目数
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){json[]} data 收藏活动
 * @apiParam (ret){int} data.id 收藏id
 * @apiParam (ret){string} data.date 收藏日期
 * @apiParam (ret){json} data.activity 收藏活动
 * @apiParam (ret){int} data.activity.id 活动id
 * @apiParam (ret){string} data.activity.image 活动图片
 * @apiParam (ret){string} data.activity.title 活动标题
 * @apiParam (ret){string} data.activity.description 其他描述
 * @apiParam (ret){string} data.activity.acttime 活动发布时间
 * @apiParam (ret){int} data.activity.collectnum 收藏数
 * @apiParam (ret){int} data.activity.applynum 参加数
 * @apiParam (ret){int} data.activity.watchnum 查看数
 * @apiParam (ret){json} data.activity.author 发布者
 * @apiParam (ret){int} data.activity.author.id 发布者id
 * @apiParam (ret){string} data.activity.author.head 发布者头像
 * @apiParam (ret){string} data.activity.author.name 发布者姓名
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: [{
 *		id: 2,
 *		date: "2014-11-24 20:49:38.0",
 *		activity: {
 *			id: 1,
 *			status: 2,
 *			image: "head",
 *			title: "23333",
 *			acttime: "2014-11-10 23:41:50.0",
 *			applynum: 1,
 *			collectnum: 0,
 *			watchnum: 8,
 *			description: "description",
 *			author: {
 *				id: 1,
 *				head: "head",
 *				name: "name"
 *			}
 *		}
 *	}]
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 600 已经申请参加 
 */
 
 /**
 * @api {POST} upload/my/image 上传图片
 * @apiVersion 1.0.0
 * @apiName uploadimage
 * @apiGroup Common
 *
 * @apiParam (par){string} token 用户标识
 * @apiParam (par){string} max 上传文件数（整数）
 * @apiParam (par){file} file0 第0个文件（后缀名为jpg,jpeg,png,gif）
 * @apiParam (par){file} filei 第i个文件
 *
 * @apiParam (ret){int} errorcode 错误码
 * @apiParam (ret){string} msg 提示信息
 * @apiParam (ret){string} data 通过逗号分隔的文件名
 *
 * @apiSuccessExample 成功示例:
 * {
 *	errorcode: 0,
 *	msg: "成功",
 *	data: "u_1_1429221200_0.jpg,u_1_1429221200_1.jpg"
 *}
 * @apiParam (error){int} 100 参数错误
 * @apiParam (error){int} 102 用户未登录 
 * @apiParam (error){int} 104 文件格式错误
 */
 
 /**
 * @api img/{文件名} 访问图片
 * @apiVersion 1.0.0
 * @apiName getimage
 * @apiGroup Common
 *
 */
 