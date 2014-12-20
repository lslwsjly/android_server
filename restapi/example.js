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
 * @api {POST} api/new 查看最新活动
 * @apiVersion 1.0.0
 * @apiName new
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
 * @api {POST} api/hot 查看最热活动
 * @apiVersion 1.0.0
 * @apiName hot
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
 * @api {POST} api/detail 查看活动详情
 * @apiVersion 1.0.0
 * @apiName detail
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
 