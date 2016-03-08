package com.zhengchang.zcofflinereversecoding.ReverseCoding;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Constants {

	public static final String[] provinceNameArr = { "辽宁","吉林", "黑龙江", "河北", "山西",
			"陕西", "甘肃", "青海", "山东", "安徽", "江苏", "浙江",  "河南", "湖北", "湖南",
			 "江西", "台湾", "福建", "云南", "海南", "四川", "贵州", "广东", "内蒙古", "新疆",
			"广西", "西藏", "宁夏", "上海", "天津", "重庆", "香港", "澳门","北京" };

    public static final String[]provincePinYinArr={"liaoning","jilin","heilongjiang","hebei","shanxi",
            "shaanxi","gansu","qinghai","shandong","anhui","jiangsu","zhejiang","henan","hubei","hunan",
            "jiangxi","taiwan","fujian","yunnan","hainan","sichuan","guizhou","guangdong","neimenggu","xinjiang",
            "guangxi","xizang","ningxia","shanghai","tianjin","chongqing","xianggang","aomen","beijing"};

    public static final String[] countiesArr = {
    "中国","蒙古", "朝鲜", "韩国", "日本", "越南", "老挝", "柬埔寨", "缅甸", "泰国", "马来西亚", "文莱", "新加坡", "印度尼西亚", "东帝汶",
    "尼泊尔", "不丹", "孟加拉国", "印度", "巴基斯坦", "斯里兰卡", "马尔代夫", "吉尔吉斯斯坦", "塔吉克斯坦", "乌兹别克斯坦", "土库曼斯坦", 
    "阿富汗", "伊拉克", "伊朗", "约旦", "黎巴嫩", "以色列", "巴勒斯坦", "巴林", "卡塔尔", "科威特", "阿拉伯", "阿曼", "也门", 
    "亚美尼亚", "阿塞拜疆", "土耳其", "塞浦路斯", "芬兰", "瑞典", "挪威", "冰岛", "丹麦", "法罗群岛", "拉脱维亚", "立陶宛", 
    "白俄罗斯", "俄罗斯", "乌克兰", "摩尔多瓦", "捷克", "斯洛伐克", "匈牙利", "德国", "奥地利", "瑞士", "列支敦士登", "英国", "爱尔兰", 
    "比利时", "卢森堡", "法国", "罗马尼亚", "保加利亚", "塞尔维亚", "马其顿", "阿尔巴尼亚", "希腊", "斯洛文尼亚", "克罗地亚", "意大利", 
    "梵蒂冈", "圣马力诺", "马耳他", "西班牙", "葡萄牙", "安道尔", "阿尔及利亚", "安哥拉", "贝宁", "博茨瓦纳", "布基纳法索", "布隆迪", 
    "喀麦隆", "佛得角", "中非", "科摩罗", "科特迪瓦", "吉布提", "埃及", "赤道几内亚", "厄立特里亚", "埃塞俄比亚", "加蓬",
    "加纳", "几内亚", "几内亚比绍", "肯尼亚", "莱索托", "利比里亚", "利比亚", "马达加斯加", "马拉维", "马里", "毛里塔尼亚", "毛里求斯", 
    "摩洛哥", "莫桑比克", "尼日尔", "尼日利亚", "留尼汪", "卢旺达", "圣赫勒拿", "圣多美和普林西比", "塞内加尔", "塞舌尔", "塞拉利昂", 
    "索马里", "苏丹", "斯威士兰", "坦桑尼亚", "多哥", "突尼斯", "乌干达", "西撒哈拉", "赞比亚", "津巴布韦", "美属萨摩亚", "澳大利亚", 
    "库克群岛", "法属波利尼西亚", "关岛", "基里巴斯", "马绍尔群岛", "密克罗尼西亚", "瑙鲁", "新喀里多尼亚", "新西兰", "纽埃", "北马里亚纳", 
    "帕劳", "巴布亚新几内亚", "萨摩亚", "所罗门群岛", "托克劳", "汤加", "图瓦卢", "瓦努阿图", "瓦利斯和富图纳", "安圭拉", "安提瓜和巴布达", 
    "阿鲁巴", "巴哈马", "伯利兹", "百慕大", "英属维尔京群岛", "加拿大", "开曼群岛", "多米尼克", "多米尼加", "萨尔瓦多", "瓜德罗普", 
    "危地马拉", "海地", "洪都拉斯", "牙买加", "马提尼克", "墨西哥", "蒙特塞拉特", "荷属安的列斯", "尼加拉瓜", "巴拿马", "波多黎各", 
    "圣基茨和尼维斯", "圣卢西亚", "圣文森特和格林纳丁", "特立尼达和多巴哥", "美国", "美属维尔京群岛", "阿根廷", "玻利维亚", "巴西", 
    "哥伦比亚", "厄瓜多尔", "法属圭亚那", "圭亚那", "巴拉圭", "苏里南", "乌拉圭", "委内瑞拉","格鲁吉亚","哈萨克斯坦","菲律宾",
            "沙特阿拉伯","叙利亚","波黑","爱沙尼亚","摩纳哥","荷兰","波兰","巴巴多斯","乍得","刚果(布)","刚果(金)","冈比亚","纳米比亚",
            "南非","斐济","皮特凯恩","智利","秘鲁","哥斯达黎加","古巴","格陵兰","格林纳达","特克斯和凯科斯群岛"};

    public static final String[] countiesPinyinarr={
            "zhongguo","menggu","chaoxian","hanguo","riben","yuenan","laowo","jianpuzhai","miandian","taiguo","malaixiya","wenlai","xinjiapo","yindunixiya","dongdiwen",
            "niboer","budan","mengjiala","yindu","bajisitan","sililanka","maerdaifu","jierjisisitan","tajikesitan","wuzibiekesitan","tukumansitan",
            "afuhan","yilake","yilang","yuedan","libanen","yiselie","balesitan","balin","kataer","keweite","alabo","aman","yemen",
            "yameiniya","asaibaijiang","tuerqi","saipulusi","fenlan","ruidian","nuowei","bingdao","danmai","faluoqundao","latuoweiya","litaowan",
            "baieluosi","eluosi","wukelan","moerduowa","jieke","siluofake","xiongyali","deguo","aodili","ruishi","liezhidunshideng","yingguo","aierlan",
            "bilishi","lusenbao","faguo","luomaniya","baojialiya","saierweiya","maqidun","aerbaniya","xila","siluowenniya","keluodiya","yidali",
            "fandigang","shengmalinuo","maerta","xibanya","putaoya","andaoer","aerjiliya","angela","beining","bociwana","bujinafasuo","bulongdi",
            "kamailong","fodejiao","zhongfei","kemoluo","ketediwa","jibuti","aiji","chidaojineiya","eliteliya","aisaiebiya","jiapeng",
            "jiana","jineiya","jineiyabishao","kenniya","laisuotuo","libiliya","libiya","madajiasijia","malawei","mali","maolitaniya","maoliqiusi",
            "moluoge","mosangbike","nirier","niriliya","liuniwang","luwangda","shenghelena","shengduomeihepulinxibi","saineijiaer","saisheer","sailaliang",
            "suomali","sudan","siweishilan","tansangniya","duoge","tunisi","wuganda","xisahala","zanbiya","jinbabuwei","meishusamoya","aodaliya",
            "kukequndao","fashubolinixiya","guandao","jilibasi","mashaoerqundao","mikeluonixiya","naolu","xinkaliduoniya","xinxilan","niuai","beimaliyana",
            "palao","babuyaxinjineiya","samoya","suoluomenqundao","tuokelao","tangjia","tuwalu","wanuatu","walisihefutuna","anguila","antiguahebabuda",
            "aluba","bahama","bolizi","baimuda","yingshuweierjingqundao","jianada","kaimanqundao","duominike","duominijia","saerwaduo","guadeluopu",
            "weidimala","haidi","hongdulasi","yamaijia","matinike","moxige","mengtesailate","heshuandeliesi","nijialagua","banama","boduolige",
            "shengjiciheniweisi","shengluxiya","shengwensentehegelinnading","telinidaheduobage","meiguo","meishuweierjingqundao",
            "agenting","boliweiya","baxi","gelunbiya","eguaduoer","fashuguiyana","guiyana","balagui","sulinan","wulagui","weineiruila","gelujiya","hasakesitan",
            "feilvbin","shatealabo","xuliya","bohei","aishaniya","monage","helan","bolan","babaduosi","zhade","gangguobu","gangguojin","gangbiya",
            "namibiya","nanfei","feiji","pitekaien","zhili","bilu","gesidalijia","guba","gelinglan","gelinnada","tekesihekaikesiqundao"};
    


    private static final HashMap <String,String> provinceLocalName_PinyinMap = new HashMap<String, String>() {{
        int length = provinceNameArr.length;
        for (int i = 0; i < length; i++) {
            this.put(provinceNameArr[i], provincePinYinArr[i]);
        }
    }};

    private static final HashMap <String,String> CountryLocalName_PinyinMap = new HashMap<String, String>() {{
        int length = countiesPinyinarr.length;
        for (int i = 0; i < length; i++) {
            this.put(countiesArr[i], countiesPinyinarr[i]);
        }
    }};

    public static final String pinyinForName(String name){
        String result = provinceLocalName_PinyinMap.get(name);
        if (result!= null && result.length()>0){
            return result;
        }
        result = CountryLocalName_PinyinMap.get(name);

        return result;
    }



	public static final HashMap<String, String> getProvinceLocalName_PinyinMap() {
		return provinceLocalName_PinyinMap;
	}

    public static String[] asiaCountries = {
            "阿富汗",
        "亚美尼亚",
        "阿塞拜疆",
        "巴林",
        "孟加拉国",
        "不丹",
        "文莱",
        "柬埔寨",
        "中国",
        "塞浦路斯",
        "格鲁吉亚",
        "印度",
        "印度尼西亚",
        "伊朗",
        "伊拉克",
        "以色列",
        "日本",
        "约旦",
        "哈萨克斯坦",
        "朝鲜",
        "韩国",
        "科威特",
        "吉尔吉斯斯坦",
        "老挝",
        "黎巴嫩",
        "马来西亚",
        "马尔代夫",
        "蒙古",
        "缅甸",
        "尼泊尔",
        "阿曼",
        "巴基斯坦",
        "巴勒斯坦",
        "菲律宾",
        "卡塔尔",
        "沙特阿拉伯",
        "新加坡",
        "斯里兰卡",
        "叙利亚",
        "塔吉克斯坦",
        "泰国",
        "东帝汶",
        "土耳其",
        "土库曼斯坦",
        "阿拉伯",
        "乌兹别克斯坦",
        "越南",
        "也门"};

    public static String[] europeCountries = {
        "阿尔巴尼亚",
        "安道尔",
        "奥地利",
        "白俄罗斯",
        "比利时",
        "波黑",
        "保加利亚",
        "克罗地亚",
        "捷克",
        "丹麦",
        "爱沙尼亚",
        "法罗群岛",
        "芬兰",
        "法国",
        "德国",
        "希腊",
        "梵蒂冈",
        "匈牙利",
        "冰岛",
        "爱尔兰",
        "意大利",
        "拉脱维亚",
        "列支敦士登",
        "立陶宛",
        "卢森堡",
        "马其顿",
        "马耳他",
        "摩尔多瓦",
        "摩纳哥",
        "荷兰",
        "挪威",
        "波兰",
        "葡萄牙",
        "罗马尼亚",
        "俄罗斯",
        "圣马力诺",
        "塞尔维亚",
        "斯洛伐克",
        "斯洛文尼亚",
        "西班牙",
        "瑞典",
        "瑞士",
        "乌克兰",
        "英国"};

    public static String[] southAmericaCountries = {
        "阿根廷",
        "玻利维亚",
        "巴西",
        "智利",
        "哥伦比亚",
        "厄瓜多尔",
        "法属圭亚那",
        "圭亚那",
        "巴拉圭",
        "秘鲁",
        "苏里南",
        "乌拉圭",
        "委内瑞拉"};

    public static String[] northAmericaCountries = {
        "安圭拉",
        "安提瓜和巴布达",
        "阿鲁巴",
        "巴哈马",
        "巴巴多斯",
        "伯利兹",
        "百慕大",
        "英属维尔京群岛",
        "加拿大",
        "开曼群岛",
        "哥斯达黎加",
        "古巴",
        "多米尼克",
        "多米尼加",
        "萨尔瓦多",
        "格陵兰",
        "格林纳达",
        "瓜德罗普",
        "危地马拉",
        "海地",
        "洪都拉斯",
        "牙买加",
        "马提尼克",
        "墨西哥",
        "蒙特塞拉特",
        "荷属安的列斯",
        "尼加拉瓜",
        "巴拿马",
        "波多黎各",
        "圣基茨和尼维斯",
        "圣卢西亚",
        "圣文森特和格林纳丁",
        "特立尼达和多巴哥",
        "特克斯和凯科斯群岛",
        "美国",
        "美属维尔京群岛"};

    public static String[] antarcticaCountries = {"南极洲"};

    public static String[] africaCountries = {
        "阿尔及利亚",
        "安哥拉",
        "贝宁",
        "博茨瓦纳",
        "布基纳法索",
        "布隆迪",
        "喀麦隆",
        "佛得角",
        "中非",
        "乍得",
        "科摩罗",
        "刚果(布)",
        "刚果(金)",
        "科特迪瓦",
        "吉布提",
        "埃及",
        "赤道几内亚",
        "厄立特里亚",
        "埃塞俄比亚",
        "加蓬",
        "冈比亚",
        "加纳",
        "几内亚",
        "几内亚比绍",
        "肯尼亚",
        "莱索托",
        "利比里亚",
        "利比亚",
        "马达加斯加",
        "马拉维",
        "马里",
        "毛里塔尼亚",
        "毛里求斯",
        "摩洛哥",
        "莫桑比克",
        "纳米比亚",
        "尼日尔",
        "尼日利亚",
        "留尼汪",
        "卢旺达",
        "圣赫勒拿",
        "圣多美和普林西比",
        "塞内加尔",
        "塞舌尔",
        "塞拉利昂",
        "索马里",
        "南非",
        "苏丹",
        "斯威士兰",
        "坦桑尼亚",
        "多哥",
        "突尼斯",
        "乌干达",
        "西撒哈拉",
        "赞比亚",
        "津巴布韦"
        };

    public static String[] pacificCountries = {"美属萨摩亚",
        "澳大利亚",
        "库克群岛",
        "斐济",
        "法属波利尼西亚",
        "关岛",
        "基里巴斯",
        "马绍尔群岛",
        "密克罗尼西亚",
        "瑙鲁",
        "新喀里多尼亚",
        "新西兰",
        "纽埃",
        "北马里亚纳",
        "帕劳",
        "巴布亚新几内亚",
        "皮特凯恩",
        "萨摩亚",
        "所罗门群岛",
        "托克劳",
        "汤加",
        "图瓦卢",
        "瓦努阿图",
        "瓦利斯和富图纳"};
}
