define({ api: [
  {
    "type": "POST",
    "url": "activity/detail",
    "title": "查看活动详情",
    "version": "1.0.0",
    "name": "detail",
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
    "filename": "restapi/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "activity/list/hot",
    "title": "查看最热活动",
    "version": "1.0.0",
    "name": "hot",
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
    "filename": "restapi/example.js",
    "groupTitle": "Activity"
  },
  {
    "type": "POST",
    "url": "api/new",
    "title": "查看最新活动",
    "version": "1.0.0",
    "name": "new",
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
    "filename": "restapi/example.js",
    "groupTitle": "Activity"
  }
] });