delete from movie_orders;
delete from arrangement;
delete from movie;
delete from cinema;

insert into cinema(
	id, name, location)
	VALUES (
	'1c',
	'AMG海上明珠影城（上海联洋广场店）',
	'地址：浦东新区花木街道芳甸路208-233号联洋广场A区2层'
	),
	('2c',
	'CGV影城（九亭金地广场SphereX店）',
	'松江区九亭镇沪亭北路99弄3号金地广场L3028'
	),
	('3c',
	'CGV影城（安亭店）',
	'嘉定区安亭镇墨玉南路1055号嘉亭荟城市生活广场3楼（11号线安亭站）'
	);

insert into movie(
	id, titlechinese, titleenglish, imageurl, director,
	actors, types, releasedate, duration, introduction,
	rotationimageurl, score)
	VALUES ('01x', '光年正传', 'Lightyear', '/assets/img/poster/p2873213286.webp', '安格斯·麦克莱恩',
	'克里斯·埃文斯 / 柯柯·帕尔莫 / 彼得·孙 / 塔伊加·维迪提 / 戴尔·索尔斯 / 詹姆斯·布洛林 / 乌佐·阿杜巴 / 玛丽·麦克唐纳-刘易斯 / 小伊塞亚·维特洛克 / 安格斯·麦克莱恩 / 比尔·哈德尔 / 艾弗连·莱米雷斯 / 凯拉·海斯顿',
	'剧情 / 动作 / 科幻 / 动画 / 冒险', '2022-06-17', '105', '皮克斯打造《玩具总动员》系列衍生动画电影《光年正传》，美队Chris Evans配音。讲述巴斯光年人类原型宇航员的起源故事，他从一个年轻的试飞员，变为大家熟知的太空游侠。',
	'/assets/img/carousel/p2872122992.webp', 7.2),
	('015x',
    '明日战记','Warriors of Future','/assets/img/poster/p2876734663.webp','吴炫辉','古天乐 / 刘青云 / 刘嘉玲 / 姜皓文 / 谢君豪 / 吴倩 / 万国鹏 / 张家辉 / 刘浩良 / 麦天枢','动作 / 科幻',
    '2022-08-05','99','未来世界，地球因环境污染而千疮百孔，人类家园破败萧条。一颗陨石突然撞击地球，并带来杀伤力极强的外星生物，560万人将因此失去生命。人类命运岌岌可危，总指挥李升（张家辉 饰）派出以军人泰来（古天乐 饰）为首的精英部队前往执行改造计划，部队却突遭暴力攻击，只有泰来和通讯兵光仔（万国鹏 饰）幸存。军官谭冰（刘嘉玲 饰）坚持执行PlanB，指挥官郑重生（刘青云 饰）反对并找来旧友臭鼬（姜皓文 饰）前往支援。拯救家园刻不容缓，但在通讯员小绿（吴倩 饰）悄悄提醒下，泰来发现了一个足以毁天灭地的邪恶阴谋……',
    '/assets/img/carousel/p2876737138.webp','6.4'
  ),
  ('02x',
     '小黄人大眼萌：神偷奶爸前传',
     'Minions The Rise of Gru',
    '/assets/img/poster/p2877521744.webp',
    '凯尔·巴尔达 / 布拉德·埃布尔森 / 乔纳森·德尔瓦尔',
    '史蒂夫·卡瑞尔 / 皮埃尔·柯芬 / 艾伦·阿金 / 塔拉吉·P·汉森 / 杨紫琼',
    '喜剧 / 科幻 / 动画 / 犯罪 / 冒险',
    '2022-08-19',
    '87',
    '这部新片将是2015年推出的小黄人独立电影《小黄人大眼萌》的直接续集。它作为《神偷奶爸》的衍生作品，讲述了小黄人们在“前格鲁”时代为其他主人服务的经历，不过少年格鲁曾经出现在这部衍生电影里，续集将围绕他与小黄人们结缘的过程展开剧情。',
     '/assets/img/carousel/p2877528917.webp',
    '7.2'
  ),
  (
  '03x',
     '铁血战士：猎物',
     'Prey',
    '/assets/img/poster/p2877271443.webp',
    '丹·特拉亨伯格',
    '安伯·明迪桑德 / 达寇塔·比弗 / 戴恩·迪利格罗 / 斯托米·基普 / 米歇尔·史拉斯 / 更多...',
    '动作 / 科幻 / 恐怖',
    '2022-08-05',
    '99',
    '本片以300年前的科曼奇族为背景，讲述了一个名叫纳鲁的年轻女子的故事，她是一位凶猛且技艺高超的战士。她在大平原上一些传奇的猎人阴影下长大，所以当危险威胁到她的营地时，她要保护她的族人。当她发现自己面对的猎物是一个高度进化的外星掠食者，且拥有先进的技术武器，一场恶战开始了！',
     '',
    '6.6'
  ),
  ('04x',
     '13条命',
     'Thirteen Lives',
    '/assets/img/poster/p2875288644.webp',
    '朗·霍华德',
    '维果·莫腾森 / 科林·法瑞尔 / 乔尔·埃哲顿 / 汤姆·巴特曼 / 乔什·赫尔曼 / 更多...',
    '剧情 / 惊悚 / 传记',
    '2022-07-29',
    '142',
    '改编自2018年泰国洞穴救援事件，讲述在泰国清莱省一个被洪水淹没的洞穴中，营救多名野猪足球队队员和教练的故事。',
     '',
    '8.1'
  ),
  ('05x',
     '祝你好运',
     'Luck',
    '/assets/img/poster/p2875811269.webp',
    '佩吉·霍姆斯',
    '伊娃·诺布勒札达 / 西蒙·佩吉 / 简·方达 / 乌比·戈德堡 / 弗卢拉·博格 / 更多...',
    '喜剧 / 动画 / 奇幻 / 冒险',
    '2022-08-05',
    '105',
    '简·方达将为动画新片[幸运]中的主要角色配音。该片由佩吉·霍姆斯([小叮当与海盗仙子])执导，由基尔·默里([赛车总动员])操刀剧本。故事讲述在一个好运气和坏运气互相碰撞的世界中，一个不幸的女孩必须介入并拯救这个世界。 简·方达将为龙配音，龙是热情洋溢的掌管好运气的CEO，她是毫无争议的最幸运的远古生物。龙很优雅，风格明确，她强大并且有说服力。唯一比好运更好的事情就是更多的好运，所以当坏运气开始失控，她必须直面自己的恐惧，面临永远失去好运气的风险。该片由天空之舞与苹果联合制作。',
     '',
    '6.7'
  ),
  ('06x',
     '灰影人',
     'The Gray Man',
    '/assets/img/poster/p2873535079.webp',
    '安东尼·罗素 / 乔·罗素',
    '瑞恩·高斯林 / 克里斯·埃文斯 / 安娜·德·阿玛斯 / 杰西卡·亨维克 / 茱莉亚·巴特斯 / 更多...',
    '动作 / 惊悚',
    '2022-07-15',
    '129',
    '《灰影人》由Netflix和AGBO合制，剧情讲述人称“灰影人”的寇特·詹特利（瑞恩·高斯林 饰）为中情局效命，特务代号“山岭六号”。上线唐纳德·菲茨罗伊（比利·鲍伯·松顿 饰）当初将他弄出联邦监狱，让他成为局里钦点的精锐死亡佣兵。如今风水轮流转，六号反倒沦为头号目标，中情局前同事洛伊德·汉森（克里斯·埃文斯 饰）为了铲除他，无所不用其极地发动全球围攻，特工达妮·米兰达（安娜·德·阿玛斯 饰）却总能在他千钧一发之际伸出援手。',
     '',
    '6.6'
  ),
  ('07x',
     '魔女2',
     'Part2. The Other One',
    '/assets/img/poster/p2876269418.webp',
    '朴勋政',
    '申诗雅 / 朴恩斌 / 徐恩秀 / 晋久 / 成侑彬 / 更多...',
    '动作 / 悬疑',
    '2022-06-15',
    '137',
    '影片讲述了一名少女在某个巨型秘密实验室里醒来，她逃出实验室，偶然遇到努力从犯罪组织那里守护自己的家的庆熙。闯入庆熙家里的犯罪组织和少女冲突后，少女以压倒性的实力打败了他们。这期间，秘密实验室一直在追踪少女，这名神秘的少女到底是谁？',
     '',
    '6.1'
  ),
  ('08x',
     '不好',
     'Not Okay',
    '/assets/img/poster/p2876166904.webp',
    '奎恩·谢法德',
    '佐伊·达奇 / 迪伦·奥布莱恩 / 艾伯丝·戴维兹 / 布雷南·布朗 / 卡兰·索尼 / 更多...',
    '剧情 / 喜剧',
    '2022-07-29',
    '100',
    '讲述一个误入歧途的年轻女子渴望朋友和名声，她假装去巴黎旅行，以提升自己在社交媒体上的形象。当现实世界突然发生了一个可怕的事件、成为她假想旅行的一部分，她善意的谎言成为了道德困境，给予她想要的所有关注。',
     '',
    '6.0'
  ),
  ('09x',
     '独行月球',
     'Moon Man',
    '/assets/img/poster/p2876409008.webp',
    '张吃鱼',
    '沈腾 / 马丽 / 常远 / 李诚儒 / 黄才伦 / 更多...',
    '喜剧 / 科幻',
    '2022-07-29',
    '122',
    '人类为抵御小行星的撞击，拯救地球，在月球部署了月盾计划。陨石提前来袭，全员紧急撤离时，维修工独孤月（沈腾 饰）因为意外，错过了领队马蓝星（马丽 饰）的撤离通知，一个人落在了月球。不料月盾计划失败，独孤月成为了“宇宙最后的人类”，开始了他在月球上破罐子破摔的生活……',
     '/assets/img/carousel/p2876512579.webp',
    '6.8'
  ),
  ('010x',
     '我们的样子像极了爱情',
     'Close to Love',
    '/assets/img/poster/p2876542489.webp',
    '王梓骏',
    '李孝谦 / 漆昱辰 / 林俊毅 / 修雨秀 / 许童心 / 更多...',
    ' 剧情 / 爱情',
    '2022-08-04',
    '122',
    '遗憾的是，我爱你，只敢以朋友之名——你曾有过差一点就在一起的爱情吗？来自小城的许一（李孝谦 饰）和高晓楠（漆昱辰 饰）童年由于误会而留下遗憾，后来两人在大学重逢，就此产生了跨越多年的羁绊。许一、高晓楠在相处中解开当年的心结，从冤家到挚交，从青涩学生到职场新人，相互陪伴,一起成长，不是情侣却胜似情侣。然而, 彼此间不敢触碰的感情界线因为一次意外终于彻底爆发……这一次, 许一和高晓楠的关系能否发生转变？他们之间会是错过还是圆满？',
     '/assets/img/carousel/p2876511728.webp',
    '0'
  ),
  ('011x',
     '侏罗纪世界3：统治',
     'Jurassic World Dominion',
    '/assets/img/poster/p2873135507.webp',
    '科林·特莱沃若',
    '克里斯·帕拉特 / 布莱丝·达拉斯·霍华德 / 劳拉·邓恩 / 山姆·尼尔 / 杰夫·高布伦 / 更多...',
    '动作 / 科幻 / 冒险',
    '2022-06-10',
    '146',
    '影片为《侏罗纪世界》系列的完结篇，故事的开篇设定在纳布拉尔岛被摧毁的四年后。如今，恐龙在世界各地与人类共同生活、共同捕猎。这一脆弱的平衡将重塑未来，并最终决定人类能否与史上最可怕生物共享这颗星球，并继续站在食物链的顶端。',
     '/assets/img/carousel/p2873310932.webp',
    '6.1'
  ),
  ('012x',
     '漫长的告白',
     'Yanagawa',
    '/assets/img/poster/p2875688839.webp',
    '张律',
    '倪妮 / 张鲁一 / 辛柏青 / 池松壮亮 / 中野良子 / 更多...',
    '剧情 / 爱情 / 家庭',
    '2022-08-12',
    '113',
    '少年时代的立冬（张鲁一 饰）曾爱慕过一位叫阿川（倪妮 饰）的女子，但在某一天阿川的突然失踪成为了他十几年解不开的心结。为一解思念，立冬与哥哥立春（辛柏青 饰）去到与阿川同名的柳川，只为再见她一面。随着他们的再次相遇，很多过去的故事的真相浮出水面，立冬也知晓了阿川当年离开的真正原因，而他对阿川深藏的爱，却在这场远赴“她”乡的深情告白中愈演愈烈……',
     '',
    '0'
  ),
  ('013x',
     '猎屠',
     'Butcher Hunter',
    '/assets/img/poster/p2871703242.webp',
    '郭晓峰',
    '王千源 / 许龄月 / 倪大红 / 郭晓东 / 王迅 / 更多...',
    '犯罪',
    '2022-08-12',
    '98',
    '影片讲述某地发生电信诈骗事件，一名警员潜伏到中缅边境，深入电信诈骗中心，与诈骗犯罪集团斗智斗勇的故事，是一部反电信诈骗题材的院线片。',
     '',
    '0'
  ),
  ('014x',
     '超级英雄美猴王——齐天儿',
     'The First Superhero Monkey King',
    '/assets/img/poster/p2876991448.webp',
    '拉尔夫·宗戴格 / Dick Zondag / 亓梅晓',
    '钟巍 / 张琦 / 张欣 / 孟祥龙 / 程玉珠 / 更多...',
    '喜剧 / 动作 / 动画',
    '2022-08-12',
    '105',
    '影片讲述了石猴齐天儿从出生到大闹天宫的一段故事。',
     '',
    '0'
  );

insert into arrangement(
	id,  "time",room, movie_id, cinema_id, price,arrange_date)
	VALUES (
	'1a',
		'18:00:00',
		'room 1',
		'014x',
		'1c',
		35,
		'2022-08-10'
	),
	('2a',
		'12:00:00',
		'room 2',
		'014x',
		'1c',
		86,
		'2022-08-11'
	),
	('3a',
		'18:00:00',
		'room 3',
		'014x',
		'1c',
		78,
		'2022-08-16'
	),
	('4a',
		'14:00:00',
		'room 4',
		'014x',
		'1c',
		83,
		'2022-08-12'
	),
	('5a',
		'10:00:00',
		'room 5',
		'014x',
		'1c',
		96,
		'2022-08-10'
	),
	('6a',
		'18:00:00',
		'room 6',
		'01x',
		'1c',
		76,
		'2022-08-11'
	),
	('7a',
		'19:00:00',
		'room 7',
		'01x',
		'1c',
		65,
		'2022-08-10'
	),
	('8a',
		'17:00:00',
		'room 8',
		'01x',
		'1c',
		67,
		'2022-08-12'
	),
	('9a',
		'20:00:00',
		'room 9',
		'01x',
		'1c',
		59,
		'2022-08-14'
	),
	('10a',
		'22:00:00',
		'room 10',
		'01x',
		'1c',
		78,
		'2022-08-13'
	);
