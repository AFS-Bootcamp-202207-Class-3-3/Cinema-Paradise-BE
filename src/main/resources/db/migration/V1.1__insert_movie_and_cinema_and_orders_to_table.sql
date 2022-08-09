INSERT INTO cinema(
	id, name, location)
	VALUES ('11x', 'Leo万达', 'Leo的心里'),
    ('22x', 'Leo英皇', 'Leo在看的地方');


INSERT INTO movie(
	id, titlechinese, titleenglish, imageurl, director, actors, types, releasedate, duration, introduction, rotationimageurl, score)
	VALUES ('1x', '小黄人大眼萌：神偷奶爸前传', 'Minions: The Rise of Gru (2022)', '/assets/img/MinionsTheRiseofGru.jpg', '凯尔·巴尔达 / 布拉德·埃布尔森 / 乔纳森·德尔瓦尔', '史蒂夫·卡瑞尔 / 皮埃尔·柯芬 / 艾伦·阿金 / 塔拉吉·P·汉森 / 杨紫琼', '喜剧 / 科幻 / 动画 / 犯罪 / 冒险', '2022-07-01', 87, '这部新片将是2015年推出的小黄人独立电影《小黄人大眼萌》的直接续集。它作为《神偷奶爸》的衍生作品，讲述了小黄人们在“前格鲁”时代为其他主人服务的经历，不过少年格鲁曾经出现在这部衍生电影里，续集将围绕他与小黄人们结缘的过程展开剧情。', '', 7.2),
	('2x', 'Da黄人大眼萌：神偷奶爸后传', 'Minions: The Rise of Gru (2022)', '/assets/img/MinionsTheRiseofGru.jpg', '凯尔·巴尔达 / 布拉德·埃布尔森 / 乔纳森·德尔瓦尔', '史蒂夫·卡瑞尔 / 皮埃尔·柯芬 / 艾伦·阿金 / 塔拉吉·P·汉森 / 杨紫琼', '喜剧 / 科幻 / 动画 / 犯罪 / 冒险', '2022-07-01', 87, '这部新片将是2015年推出的小黄人独立电影《小黄人大眼萌》的直接续集。它作为《神偷奶爸》的衍生作品，讲述了小黄人们在“前格鲁”时代为其他主人服务的经历，不过少年格鲁曾经出现在这部衍生电影里，续集将围绕他与小黄人们结缘的过程展开剧情。', '', 8.8);


INSERT INTO movie_orders(
	id, user_id, movie_id, price, cinema_id, room, order_date, order_time, seat, paid)
	VALUES ('1xx', 'user1', '1x', 36.7, '11x', 'A', '2022-08-09', '21:00:00', '13排6号', false),
    ('2xx', 'user2', '2x', 22.7, '22x', 'B', '2022-08-10', '9:00:00', '14排6号', true);