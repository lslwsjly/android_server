define({ api: [
  {
    "type": "POST",
    "url": "activity/my/checkcollect",
    "title": "是否收藏活动",
    "version": "1.0.0",
    "name": "actcollectcheck",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "id",
            "description": "<p>活动id</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data",
            "description": "<p>已收藏／未收藏</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: \"已收藏\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "activity/detail",
    "title": "查看活动详情",
    "version": "1.0.0",
    "name": "actdetail",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "id",
            "description": "<p>活动id</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "json[]",
            "optional": false,
            "field": "data",
            "description": "<p>活动信息</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.title",
            "description": "<p>活动标题</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.acttime",
            "description": "<p>活动发布时间</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.starttime",
            "description": "<p>活动开始时间</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.endtime",
            "description": "<p>活动结束时间</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.applytime",
            "description": "<p>申请截止时间</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.numlimit",
            "description": "<p>人数限制</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.address",
            "description": "<p>活动地址</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.fee",
            "description": "<p>活动费用</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.benefit",
            "description": "<p>活动益处</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.feature",
            "description": "<p>活动特点</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.description",
            "description": "<p>其他描述</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.type",
            "description": "<p>活动类型id</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.schoollimit",
            "description": "<p>学校限制id</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.gradelimit",
            "description": "<p>年级限制id</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.genderlimit",
            "description": "<p>性别限制，1为男，2为女</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.contact",
            "description": "<p>联系方式</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.image",
            "description": "<p>活动图片</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.status",
            "description": "<p>活动状态</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.collectnum",
            "description": "<p>收藏数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.applynum",
            "description": "<p>参加数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.watchnum",
            "description": "<p>查看数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.hotvalue",
            "description": "<p>热度值</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.author",
            "description": "<p>发布者</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.author.id",
            "description": "<p>发布者id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.head",
            "description": "<p>发布者头像</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.name",
            "description": "<p>发布者姓名</p> "
          },
          {
            "group": "ret",
            "type": "json[]",
            "optional": false,
            "field": "data.candidate",
            "description": "<p>参加情况</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.candidate.id",
            "description": "<p>申请id</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.candidate.status",
            "description": "<p>申请状态，2的时候为未处理，1为通过，0为拒绝</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.candidate.date",
            "description": "<p>申请时间</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.candidate.author",
            "description": "<p>参加者</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.candidate.author.id",
            "description": "<p>参加者id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.candidate.author.head",
            "description": "<p>参加者头像</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.candidate.author.name",
            "description": "<p>参加者姓名</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "500",
            "description": "<p>指定范围查找不到内容</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: {\n\t\tid: 1,\n\t\ttitle: \"23333\",\n\t\tacttime: \"2014-11-10 23:41:50.0\",\n\t\tstarttime: \"2014-11-10 00:00:00.0\",\n\t\tendtime: \"2014-11-10 00:00:00.0\",\n\t\tapplytime: \"2014-11-10 00:00:00.0\",\n\t\tnumlimit: 10,\n\t\taddress: \"222\",\n\t\tfee: 0,\n\t\tbenefit: \"222\",\n\t\tfeature: \"222\",\n\t\tdescription: \"description\",\n\t\ttype: 2,\n\t\tschoollimit: 2,\n\t\tgradelimit: 3,\n\t\tgenderlimit: 1,\n\t\tcontact: \"222\",\n\t\timage: \"head\",\n\t\tstatus: 1,\n\t\tcollectnum: 0,\n\t\tapplynum: 1,\n\t\twatchnum: 7,\n\t\thotvalue: 0,\n\t\tcandidate: [{\n\t\t\tid: 2,\n\t\t\tstatus: 2,\n\t\t\tdate: \"2014-11-24 20:49:38.0\",\n\t\t\tauthor: {\n\t\t\t\tid: 1,\n\t\t\t\thead: \"head\",\n\t\t\t\tname: \"name\"\n\t\t\t}\n\t\t}],\n\t\tauthor: {\n\t\t\tid: 1,\n\t\t\thead: \"head\",\n\t\t\tname: \"name\"\n\t\t}\n\t}\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "activity/list/hot",
    "title": "查看最热活动",
    "version": "1.0.0",
    "name": "actlisthot",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "offset",
            "description": "<p>条目偏移量</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "limit",
            "description": "<p>条目数</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "school",
            "description": "<p>学校id（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "gender",
            "description": "<p>用户性别，1为男，2为女（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "grade",
            "description": "<p>年级id（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "type",
            "description": "<p>活动类型id（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "num",
            "description": "<p>限制人数最大值（可选）</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "json[]",
            "optional": false,
            "field": "data",
            "description": "<p>活动</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.id",
            "description": "<p>活动id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.image",
            "description": "<p>活动图片地址</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.title",
            "description": "<p>活动标题</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.acttime",
            "description": "<p>活动发布时间</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.applynum",
            "description": "<p>参加数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.collectnum",
            "description": "<p>活动收藏数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.watchnum",
            "description": "<p>活动查看数</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.description",
            "description": "<p>活动描述</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.author",
            "description": "<p>发布者</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.author.id",
            "description": "<p>发布者id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.head",
            "description": "<p>发布者头像</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.name",
            "description": "<p>发布者姓名</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "500",
            "description": "<p>指定范围查找不到内容</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: [{\n\t\tid: 1,\n\t\timage: \"head\",\n\t\ttitle: \"content\",\n\t\tacttime: \"2014-11-10 23:41:50.0\",\n\t\tapplynum: 1,\n\t\tcollectnum: 0,\n\t\twatchnum: 7,\n\t\tdescription: \"description\",\n\t\tauthor: \n\t\t{\n\t\t\tid: 1,\n\t\t\thead: \"head\",\n\t\t\tname: \"name\"\n\t\t}\n\t}]\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "activity/list/new",
    "title": "查看最新活动",
    "version": "1.0.0",
    "name": "actlistnew",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "offset",
            "description": "<p>条目偏移量</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "limit",
            "description": "<p>条目数</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "school",
            "description": "<p>学校id（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "gender",
            "description": "<p>用户性别，1为男，2为女（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "grade",
            "description": "<p>年级id（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "type",
            "description": "<p>活动类型id（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "num",
            "description": "<p>限制人数最大值（可选）</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "json[]",
            "optional": false,
            "field": "data",
            "description": "<p>活动</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.id",
            "description": "<p>活动id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.image",
            "description": "<p>活动图片地址</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.title",
            "description": "<p>活动标题</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.acttime",
            "description": "<p>活动发布时间</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.applynum",
            "description": "<p>参加数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.collectnum",
            "description": "<p>活动收藏数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.watchnum",
            "description": "<p>活动查看数</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.description",
            "description": "<p>活动描述</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.author",
            "description": "<p>发布者</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.author.id",
            "description": "<p>发布者id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.head",
            "description": "<p>发布者头像</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.name",
            "description": "<p>发布者姓名</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "500",
            "description": "<p>指定范围查找不到内容</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: [{\n\t\tid: 1,\n\t\timage: \"head\",\n\t\ttitle: \"content\",\n\t\tacttime: \"2014-11-10 23:41:50.0\",\n\t\tapplynum: 1,\n\t\tcollectnum: 0,\n\t\twatchnum: 7,\n\t\tdescription: \"description\",\n\t\tauthor: \n\t\t{\n\t\t\tid: 1,\n\t\t\thead: \"head\",\n\t\t\tname: \"name\"\n\t\t}\n\t}]\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "activity/list/suggest",
    "title": "查看推荐活动",
    "version": "1.0.0",
    "name": "actlistsuggest",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "offset",
            "description": "<p>条目偏移量</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "limit",
            "description": "<p>条目数</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "school",
            "description": "<p>学校id（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "gender",
            "description": "<p>用户性别，1为男，2为女（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "grade",
            "description": "<p>年级id（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "type",
            "description": "<p>活动类型id（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "num",
            "description": "<p>限制人数最大值（可选）</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "json[]",
            "optional": false,
            "field": "data",
            "description": "<p>活动</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.id",
            "description": "<p>活动id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.image",
            "description": "<p>活动图片地址</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.title",
            "description": "<p>活动标题</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.acttime",
            "description": "<p>活动发布时间</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.applynum",
            "description": "<p>参加数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.collectnum",
            "description": "<p>活动收藏数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.watchnum",
            "description": "<p>活动查看数</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.description",
            "description": "<p>活动描述</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.author",
            "description": "<p>发布者</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.author.id",
            "description": "<p>发布者id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.head",
            "description": "<p>发布者头像</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.name",
            "description": "<p>发布者姓名</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "500",
            "description": "<p>指定范围查找不到内容</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: [{\n\t\tid: 1,\n\t\timage: \"head\",\n\t\ttitle: \"content\",\n\t\tacttime: \"2014-11-10 23:41:50.0\",\n\t\tapplynum: 1,\n\t\tcollectnum: 0,\n\t\twatchnum: 7,\n\t\tdescription: \"description\",\n\t\tauthor: \n\t\t{\n\t\t\tid: 1,\n\t\t\thead: \"head\",\n\t\t\tname: \"name\"\n\t\t}\n\t}]\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "activity/publish",
    "title": "发布活动",
    "version": "1.0.0",
    "name": "actpublish",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "title",
            "description": "<p>活动标题</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "starttime",
            "description": "<p>活动开始时间</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "endtime",
            "description": "<p>活动结束时间</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "applytime",
            "description": "<p>申请截止时间</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "numlimit",
            "description": "<p>人数限制</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "address",
            "description": "<p>活动地址</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "fee",
            "description": "<p>活动费用（整数）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "benefit",
            "description": "<p>活动益处</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "feature",
            "description": "<p>活动特点</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "description",
            "description": "<p>其他描述</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "type",
            "description": "<p>活动类型id</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "schoollimit",
            "description": "<p>学校限制id</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "gradelimit",
            "description": "<p>年级限制id</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "genderlimit",
            "description": "<p>性别限制，1为男，2为女</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "contact",
            "description": "<p>联系方式</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "image",
            "description": "<p>活动图片</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data",
            "description": "<p>活动id</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "101",
            "description": "<p>用户无权限</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: 1\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "apply/action/add",
    "title": "申请参加活动",
    "version": "1.0.0",
    "name": "applyadd",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "activity",
            "description": "<p>活动id</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data",
            "description": "<p>申请id</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "101",
            "description": "<p>用户无权限s</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "600",
            "description": "<p>已经申请参加</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: 1\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "apply/action/check",
    "title": "申请审核",
    "version": "1.0.0",
    "name": "applycheck",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "id",
            "description": "<p>申请id</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "check",
            "description": "<p>0为拒绝申请，1为同意申请</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "101",
            "description": "<p>用户无权限</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "500",
            "description": "<p>申请不存在</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "apply/action/del",
    "title": "取消申请",
    "version": "1.0.0",
    "name": "applydel",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "activity",
            "description": "<p>活动id</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data",
            "description": "<p>申请id</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "101",
            "description": "<p>用户无权限</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "500",
            "description": "<p>用户未申请参加</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "apply/action/list",
    "title": "查看本人所有申请",
    "version": "1.0.0",
    "name": "applylist",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "offset",
            "description": "<p>条目偏移量</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "limit",
            "description": "<p>条目数</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "json[]",
            "optional": false,
            "field": "data",
            "description": "<p>申请</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.id",
            "description": "<p>申请id</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.status",
            "description": "<p>申请状态，2的时候为未处理，1为通过，0为拒绝</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.date",
            "description": "<p>申请日期</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.activity",
            "description": "<p>申请活动</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.id",
            "description": "<p>活动id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.image",
            "description": "<p>活动图片</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.title",
            "description": "<p>活动标题</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.description",
            "description": "<p>其他描述</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.acttime",
            "description": "<p>活动发布时间</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.collectnum",
            "description": "<p>收藏数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.applynum",
            "description": "<p>参加数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.watchnum",
            "description": "<p>查看数</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.activity.author",
            "description": "<p>发布者</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.author.id",
            "description": "<p>发布者id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.author.head",
            "description": "<p>发布者头像</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.author.name",
            "description": "<p>发布者姓名</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "600",
            "description": "<p>已经申请参加</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: [{\n\t\tid: 2,\n\t\tdate: \"2014-11-24 20:49:38.0\",\n\t\tactivity: {\n\t\t\tid: 1,\n\t\t\tstatus: 2,\n\t\t\timage: \"head\",\n\t\t\ttitle: \"23333\",\n\t\t\tacttime: \"2014-11-10 23:41:50.0\",\n\t\t\tapplynum: 1,\n\t\t\tcollectnum: 0,\n\t\t\twatchnum: 8,\n\t\t\tdescription: \"description\",\n\t\t\tauthor: {\n\t\t\t\tid: 1,\n\t\t\t\thead: \"head\",\n\t\t\t\tname: \"name\"\n\t\t\t}\n\t\t}\n\t}]\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "collect/my/add",
    "title": "收藏活动",
    "version": "1.0.0",
    "name": "collectadd",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "activity",
            "description": "<p>活动id</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data",
            "description": "<p>收藏id</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "600",
            "description": "<p>已经收藏</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: 1\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "collect/my/del",
    "title": "取消收藏",
    "version": "1.0.0",
    "name": "collectdel",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "activity",
            "description": "<p>活动id</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data",
            "description": "<p>申请id</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "500",
            "description": "<p>用户未收藏</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "collect/my/list",
    "title": "查看本人所有收藏",
    "version": "1.0.0",
    "name": "collectlist",
    "group": "Activity",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "offset",
            "description": "<p>条目偏移量</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "limit",
            "description": "<p>条目数</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "json[]",
            "optional": false,
            "field": "data",
            "description": "<p>收藏活动</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.id",
            "description": "<p>收藏id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.date",
            "description": "<p>收藏日期</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.activity",
            "description": "<p>收藏活动</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.id",
            "description": "<p>活动id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.image",
            "description": "<p>活动图片</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.title",
            "description": "<p>活动标题</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.description",
            "description": "<p>其他描述</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.acttime",
            "description": "<p>活动发布时间</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.collectnum",
            "description": "<p>收藏数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.applynum",
            "description": "<p>参加数</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.watchnum",
            "description": "<p>查看数</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.activity.author",
            "description": "<p>发布者</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.author.id",
            "description": "<p>发布者id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.author.head",
            "description": "<p>发布者头像</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.activity.author.name",
            "description": "<p>发布者姓名</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "600",
            "description": "<p>已经申请参加</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: [{\n\t\tid: 2,\n\t\tdate: \"2014-11-24 20:49:38.0\",\n\t\tactivity: {\n\t\t\tid: 1,\n\t\t\tstatus: 2,\n\t\t\timage: \"head\",\n\t\t\ttitle: \"23333\",\n\t\t\tacttime: \"2014-11-10 23:41:50.0\",\n\t\t\tapplynum: 1,\n\t\t\tcollectnum: 0,\n\t\t\twatchnum: 8,\n\t\t\tdescription: \"description\",\n\t\t\tauthor: {\n\t\t\t\tid: 1,\n\t\t\t\thead: \"head\",\n\t\t\t\tname: \"name\"\n\t\t\t}\n\t\t}\n\t}]\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "",
    "url": "img/{文件名}",
    "title": "访问图片",
    "version": "1.0.0",
    "name": "getimage",
    "group": "Common",
    "filename": "docs/example.js",
    "groupTitle": "Common"
  },
  {
    "type": "POST",
    "url": "upload/my/image",
    "title": "上传图片",
    "version": "1.0.0",
    "name": "uploadimage",
    "group": "Common",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "max",
            "description": "<p>上传文件数（整数）</p> "
          },
          {
            "group": "par",
            "type": "file",
            "optional": false,
            "field": "file0",
            "description": "<p>第0个文件（后缀名为jpg,jpeg,png,gif）</p> "
          },
          {
            "group": "par",
            "type": "file",
            "optional": false,
            "field": "filei",
            "description": "<p>第i个文件</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data",
            "description": "<p>通过逗号分隔的文件名</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "104",
            "description": "<p>文件格式错误</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: \"u_1_1429221200_0.jpg,u_1_1429221200_1.jpg\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Common"
  },
  {
    "type": "POST",
    "url": "msg/list",
    "title": "查看活动留言",
    "version": "1.0.0",
    "name": "msglist",
    "group": "Message",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "actid",
            "description": "<p>活动id</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "offset",
            "description": "<p>留言条目偏移量</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "limit",
            "description": "<p>留言条目数</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "json[]",
            "optional": false,
            "field": "data",
            "description": "<p>数据</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.id",
            "description": "<p>留言id</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.uid",
            "description": "<p>留言人id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.content",
            "description": "<p>留言内容</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.date",
            "description": "<p>留言日期</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.author",
            "description": "<p>留言者</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.author.id",
            "description": "<p>留言者id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.head",
            "description": "<p>留言者头像</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.author.name",
            "description": "<p>留言者姓名</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "500",
            "description": "<p>指定范围查找不到内容</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: [{\n\t\tid: 3,\n\t\tactid: 1,\n\t\tuid: 1,\n\t\tcontent: \"content\",\n\t\tdate: \"2014-11-23 17:05:00.0\",\n\t\tauthor: \n\t\t{\n\t\t\tid: 1,\n\t\t\thead: \"head\",\n\t\t\tname: \"name\"\n\t\t}\n\t}]\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Message"
  },
  {
    "type": "POST",
    "url": "msg/my/list",
    "title": "查看个人所有留言",
    "version": "1.0.0",
    "name": "msgmylist",
    "group": "Message",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "offset",
            "description": "<p>留言条目偏移量</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "limit",
            "description": "<p>留言条目数</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "json[]",
            "optional": false,
            "field": "data",
            "description": "<p>数据</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.id",
            "description": "<p>留言id</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.actid",
            "description": "<p>活动id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.content",
            "description": "<p>留言内容</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.date",
            "description": "<p>留言日期</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.activity",
            "description": "<p>留言活动</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.activity.title",
            "description": "<p>活动标题</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "500",
            "description": "<p>指定范围查找不到内容</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: [{\n\t\tid: 3,\n\t\tactid: 1,\n\t\tuid: 1,\n\t\tcontent: \"content\",\n\t\tdate: \"2014-11-23 17:05:00.0\",\n\t\tactivity: \n\t\t{\n\t\t\ttitle: \"title\"\n\t\t}\n\t}]\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Message"
  },
  {
    "type": "POST",
    "url": "msg/publish",
    "title": "发布留言",
    "version": "1.0.0",
    "name": "msgpublish",
    "group": "Message",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "actid",
            "description": "<p>活动id</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "content",
            "description": "<p>留言内容</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data",
            "description": "<p>留言id</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "101",
            "description": "<p>用户无权限</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"成功\",\n\tdata: 1\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "Message"
  },
  {
    "type": "POST",
    "url": "admin/reg",
    "title": "管理员注册",
    "version": "1.0.0",
    "name": "adminreg",
    "group": "User",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "mail",
            "description": "<p>管理员邮箱</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "password",
            "description": "<p>管理员密码</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "103",
            "description": "<p>注册失败</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"注册成功\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "User"
  },
  {
    "type": "POST",
    "url": "login",
    "title": "用户登录",
    "version": "1.0.0",
    "name": "login",
    "group": "User",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "mail",
            "description": "<p>用户邮箱</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "pwd",
            "description": "<p>用户密码</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data",
            "description": "<p>数据</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "ret",
            "type": "json",
            "optional": false,
            "field": "data.user",
            "description": "<p>用户</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.user.id",
            "description": "<p>用户id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.user.mail",
            "description": "<p>用户邮箱</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.user.password",
            "description": "<p>用户密码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.user.realname",
            "description": "<p>用户真实姓名</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.user.phone",
            "description": "<p>用户电话</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.user.nickname",
            "description": "<p>用户昵称</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.user.interest",
            "description": "<p>用逗号隔开的兴趣id</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.user.gender",
            "description": "<p>用户性别，1为男，2为女</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.user.school",
            "description": "<p>用户学校id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.user.department",
            "description": "<p>用户院系</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.user.grade",
            "description": "<p>用户年级id</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "data.user.headimg",
            "description": "<p>用户头像url，不含网站前缀</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.user.privilege",
            "description": "<p>用户权限值</p> "
          },
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "data.user.role",
            "description": "<p>用户角色id</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "203",
            "description": "<p>用户名错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "204",
            "description": "<p>密码错误</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"登录成功\",\n\tdata: {\n \ttoken: \"leelio7412i7\",\n\t\tuser: {\n\t\t\tid: 1,\n\t\t\tmail: \"2@2.com\",\n\t\t\tpassword: \"123\",\n\t\t\trealname: \"real\",\n\t\t\tphone: \"123\",\n\t\t\tnickname: \"name\",\n\t\t\tinterest: \"2,3\",\n\t\t\tgender: 1,\n\t\t\tschool: 1,\n\t\t\tdepartment: \"123\",\n\t\t\tgrade: 1,\n\t\t\theadimg: \"head\",\n\t\t\tprivilege: 7,\n\t\t\trole: 2\n\t\t}\n\t}\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "User"
  },
  {
    "type": "POST",
    "url": "logout",
    "title": "用户登出",
    "version": "1.0.0",
    "name": "logout",
    "group": "User",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"注销成功\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "User"
  },
  {
    "type": "POST",
    "url": "mailcheck",
    "title": "注册邮箱检查",
    "version": "1.0.0",
    "name": "mailcheck",
    "group": "User",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "mail",
            "description": "<p>用户邮箱</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "200",
            "description": "<p>注册邮箱重复</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "201",
            "description": "<p>邮箱格式错误</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"注册邮箱可用\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "User"
  },
  {
    "type": "POST",
    "url": "user/my/manage",
    "title": "个人信息修改",
    "version": "1.0.0",
    "name": "managemy",
    "group": "User",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "mail",
            "description": "<p>邮箱（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "password",
            "description": "<p>密码（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "realname",
            "description": "<p>真实姓名（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "phone",
            "description": "<p>电话（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "nickname",
            "description": "<p>昵称（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "interest",
            "description": "<p>兴趣（可选）</p> "
          },
          {
            "group": "par",
            "type": "int",
            "optional": false,
            "field": "gender",
            "description": "<p>性别，1为男，2为女（可选）</p> "
          },
          {
            "group": "par",
            "type": "int",
            "optional": false,
            "field": "school",
            "description": "<p>学校（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "department",
            "description": "<p>院系密码（可选）</p> "
          },
          {
            "group": "par",
            "type": "int",
            "optional": false,
            "field": "grade",
            "description": "<p>年级（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "stunum",
            "description": "<p>学号（可选）</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "headimg",
            "description": "<p>头像地址（可选）</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"修改成功\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "User"
  },
  {
    "type": "POST",
    "url": "admin/role",
    "title": "更改用户角色",
    "version": "1.0.0",
    "name": "managerole",
    "group": "User",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "token",
            "description": "<p>用户标识</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "id",
            "description": "<p>用户id</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "role",
            "description": "<p>新角色id</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "101",
            "description": "<p>用户无权限</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "102",
            "description": "<p>用户未登录</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "400",
            "description": "<p>用户不存在</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"修改成功\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "User"
  },
  {
    "type": "POST",
    "url": "nickcheck",
    "title": "注册昵称检查",
    "version": "1.0.0",
    "name": "nickcheck",
    "group": "User",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "nickname",
            "description": "<p>用户昵称</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "202",
            "description": "<p>注册昵称重复</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"注册昵称可用\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "User"
  },
  {
    "type": "POST",
    "url": "reg",
    "title": "用户注册",
    "version": "1.0.0",
    "name": "reg",
    "group": "User",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "mail",
            "description": "<p>用户邮箱</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "password",
            "description": "<p>用户密码</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "nickname",
            "description": "<p>用户昵称</p> "
          },
          {
            "group": "par",
            "type": "string",
            "optional": false,
            "field": "interest",
            "description": "<p>用户兴趣，用逗号分割的兴趣id</p> "
          }
        ],
        "返回值": [
          {
            "group": "ret",
            "type": "int",
            "optional": false,
            "field": "errorcode",
            "description": "<p>错误码</p> "
          },
          {
            "group": "ret",
            "type": "string",
            "optional": false,
            "field": "msg",
            "description": "<p>提示信息</p> "
          }
        ],
        "错误码含义": [
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "100",
            "description": "<p>参数错误</p> "
          },
          {
            "group": "error",
            "type": "int",
            "optional": false,
            "field": "103",
            "description": "<p>注册失败</p> "
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功示例:",
          "content": "{\n\terrorcode: 0,\n\tmsg: \"注册成功\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "docs/example.js",
    "groupTitle": "User"
  }
] });