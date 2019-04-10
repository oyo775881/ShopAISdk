package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("ALL")
public class SpecialBean implements Serializable {

    @SerializedName("show_list")
    private ShowListBean showList = null;
    private ArrayList<ArticleBean> articleList = new ArrayList<>();
    @SerializedName("home1")
    private Home1Bean home1 = null;
    @SerializedName("home2")
    private Home2Bean home2 = null;
    @SerializedName("home4")
    private Home4Bean home4 = null;
    @SerializedName("home3")
    private Home3Bean home3 = null;
    @SerializedName("home5")
    private Home5Bean home5 = null;
    @SerializedName("home6")
    private Home6Bean home6 = null;
    @SerializedName("home7")
    private Home7Bean home7 = null;
    @SerializedName("home8")
    private Home8Bean home8 = null;
    @SerializedName("goods1")
    private Goods1Bean goods1 = null;
    @SerializedName("goods2")
    private Goods2Bean goods2 = null;
    @SerializedName("goods")
    private GoodsBean goods = null;

    public ShowListBean getShowList() {
        return showList;
    }

    public void setShowList(ShowListBean showList) {
        this.showList = showList;
    }

    public ArrayList<ArticleBean> getArticleList() {
        return articleList;
    }

    public void setArticleList(ArrayList<ArticleBean> articleList) {
        this.articleList = articleList;
    }

    public Home7Bean getHome7() {
        return home7;
    }

    public void setHome7(Home7Bean home7) {
        this.home7 = home7;
    }

    public Home1Bean getHome1() {
        return home1;
    }

    public void setHome1(Home1Bean home1) {
        this.home1 = home1;
    }

    public Home2Bean getHome2() {
        return home2;
    }

    public void setHome2(Home2Bean home2) {
        this.home2 = home2;
    }

    public Home4Bean getHome4() {
        return home4;
    }

    public void setHome4(Home4Bean home4) {
        this.home4 = home4;
    }

    public Home3Bean getHome3() {
        return home3;
    }

    public void setHome3(Home3Bean home3) {
        this.home3 = home3;
    }

    public Home5Bean getHome5() {
        return home5;
    }

    public void setHome5(Home5Bean home5) {
        this.home5 = home5;
    }

    public Home6Bean getHome6() {
        return home6;
    }

    public void setHome6(Home6Bean home6) {
        this.home6 = home6;
    }

    public Home8Bean getHome8() {
        return home8;
    }

    public void setHome8(Home8Bean home8) {
        this.home8 = home8;
    }

    public Goods1Bean getGoods1() {
        return goods1;
    }

    public void setGoods1(Goods1Bean goods1) {
        this.goods1 = goods1;
    }

    public Goods2Bean getGoods2() {
        return goods2;
    }

    public void setGoods2(Goods2Bean goods2) {
        this.goods2 = goods2;
    }

    public GoodsBean getGoods() {
        return goods;
    }

    public void setGoods(GoodsBean goods) {
        this.goods = goods;
    }

    public static class ShowListBean {

        @SerializedName("item")
        private ArrayList<ItemBean> item = new ArrayList<>();

        public ArrayList<ItemBean> getItem() {
            return item;
        }

        public void setItem(ArrayList<ItemBean> item) {
            this.item = item;
        }

        public static class ItemBean {

            @SerializedName("image")
            private String image = "";
            @SerializedName("type")
            private String type = "";
            @SerializedName("data")
            private String data = "";
            @SerializedName("ico_name")
            private String icoName = "";
            @SerializedName("ico_color")
            private String icoColor = "";

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public String getIcoName() {
                return icoName;
            }

            public void setIcoName(String icoName) {
                this.icoName = icoName;
            }

            public String getIcoColor() {
                return icoColor;
            }

            public void setIcoColor(String icoColor) {
                this.icoColor = icoColor;
            }

        }

    }

    public static class ArticleBean {

        @SerializedName("article_id")
        private String articleId = "";
        @SerializedName("ac_id")
        private String acId = "";
        @SerializedName("article_url")
        private String articleUrl = "";
        @SerializedName("article_show")
        private String articleShow = "";
        @SerializedName("article_position")
        private String articlePosition = "";
        @SerializedName("article_sort")
        private String articleSort = "";
        @SerializedName("article_title")
        private String articleTitle = "";
        @SerializedName("article_content")
        private String articleContent = "";
        @SerializedName("article_time")
        private String articleTime = "";

        public String getArticleId() {
            return articleId;
        }

        public void setArticleId(String articleId) {
            this.articleId = articleId;
        }

        public String getAcId() {
            return acId;
        }

        public void setAcId(String acId) {
            this.acId = acId;
        }

        public String getArticleUrl() {
            return articleUrl;
        }

        public void setArticleUrl(String articleUrl) {
            this.articleUrl = articleUrl;
        }

        public String getArticleShow() {
            return articleShow;
        }

        public void setArticleShow(String articleShow) {
            this.articleShow = articleShow;
        }

        public String getArticlePosition() {
            return articlePosition;
        }

        public void setArticlePosition(String articlePosition) {
            this.articlePosition = articlePosition;
        }

        public String getArticleSort() {
            return articleSort;
        }

        public void setArticleSort(String articleSort) {
            this.articleSort = articleSort;
        }

        public String getArticleTitle() {
            return articleTitle;
        }

        public void setArticleTitle(String articleTitle) {
            this.articleTitle = articleTitle;
        }

        public String getArticleContent() {
            return articleContent;
        }

        public void setArticleContent(String articleContent) {
            this.articleContent = articleContent;
        }

        public String getArticleTime() {
            return articleTime;
        }

        public void setArticleTime(String articleTime) {
            this.articleTime = articleTime;
        }

    }

    public static class Home7Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("square_image")
        private String squareImage = "";
        @SerializedName("square_type")
        private String squareType = "";
        @SerializedName("square_data")
        private String squareData = "";
        @SerializedName("square_ico_name")
        private String squareIcoName = "";
        @SerializedName("square_ico_color")
        private String squareIcoColor = "";
        @SerializedName("rectangle1_image")
        private String rectangle1Image = "";
        @SerializedName("rectangle1_type")
        private String rectangle1Type = "";
        @SerializedName("rectangle1_data")
        private String rectangle1Data = "";
        @SerializedName("rectangle1_ico_name")
        private String rectangle1IcoName = "";
        @SerializedName("rectangle1_ico_color")
        private String rectangle1IcoColor = "";
        @SerializedName("rectangle2_image")
        private String rectangle2Image = "";
        @SerializedName("rectangle2_type")
        private String rectangle2Type = "";
        @SerializedName("rectangle2_data")
        private String rectangle2Data = "";
        @SerializedName("rectangle2_ico_name")
        private String rectangle2IcoName = "";
        @SerializedName("rectangle2_ico_color")
        private String rectangle2IcoColor = "";
        @SerializedName("rectangle3_image")
        private String rectangle3Image = "";
        @SerializedName("rectangle3_type")
        private String rectangle3Type = "";
        @SerializedName("rectangle3_data")
        private String rectangle3Data = "";
        @SerializedName("rectangle3_ico_name")
        private String rectangle3IcoName = "";
        @SerializedName("rectangle3_ico_color")
        private String rectangle3IcoColor = "";
        @SerializedName("rectangle4_image")
        private String rectangle4Image = "";
        @SerializedName("rectangle4_type")
        private String rectangle4Type = "";
        @SerializedName("rectangle4_data")
        private String rectangle4Data = "";
        @SerializedName("rectangle4_ico_name")
        private String rectangle4IcoName = "";
        @SerializedName("rectangle4_ico_color")
        private String rectangle4IcoColor = "";
        @SerializedName("rectangle5_image")
        private String rectangle5Image = "";
        @SerializedName("rectangle5_type")
        private String rectangle5Type = "";
        @SerializedName("rectangle5_data")
        private String rectangle5Data = "";
        @SerializedName("rectangle5_ico_name")
        private String rectangle5IcoName = "";
        @SerializedName("rectangle5_ico_color")
        private String rectangle5IcoColor = "";
        @SerializedName("rectangle6_image")
        private String rectangle6Image = "";
        @SerializedName("rectangle6_type")
        private String rectangle6Type = "";
        @SerializedName("rectangle6_data")
        private String rectangle6Data = "";
        @SerializedName("rectangle6_ico_name")
        private String rectangle6IcoName = "";
        @SerializedName("rectangle6_ico_color")
        private String rectangle6IcoColor = "";
        @SerializedName("rectangle7_image")
        private String rectangle7Image = "";
        @SerializedName("rectangle7_type")
        private String rectangle7Type = "";
        @SerializedName("rectangle7_data")
        private String rectangle7Data = "";
        @SerializedName("rectangle7_ico_name")
        private String rectangle7IcoName = "";
        @SerializedName("rectangle7_ico_color")
        private String rectangle7IcoColor = "";
        @SerializedName("rectangle8_image")
        private String rectangle8Image = "";
        @SerializedName("rectangle8_type")
        private String rectangle8Type = "";
        @SerializedName("rectangle8_data")
        private String rectangle8Data = "";
        @SerializedName("rectangle8_ico_name")
        private String rectangle8IcoName = "";
        @SerializedName("rectangle8_ico_color")
        private String rectangle8IcoColor = "";
        @SerializedName("rectangle9_image")
        private String rectangle9Image = "";
        @SerializedName("rectangle9_type")
        private String rectangle9Type = "";
        @SerializedName("rectangle9_data")
        private String rectangle9Data = "";
        @SerializedName("rectangle9_ico_name")
        private String rectangle9IcoName = "";
        @SerializedName("rectangle9_ico_color")
        private String rectangle9IcoColor = "";

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSquareImage() {
            return squareImage;
        }

        public void setSquareImage(String squareImage) {
            this.squareImage = squareImage;
        }

        public String getSquareType() {
            return squareType;
        }

        public void setSquareType(String squareType) {
            this.squareType = squareType;
        }

        public String getSquareData() {
            return squareData;
        }

        public void setSquareData(String squareData) {
            this.squareData = squareData;
        }

        public String getSquareIcoName() {
            return squareIcoName;
        }

        public void setSquareIcoName(String squareIcoName) {
            this.squareIcoName = squareIcoName;
        }

        public String getSquareIcoColor() {
            return squareIcoColor;
        }

        public void setSquareIcoColor(String squareIcoColor) {
            this.squareIcoColor = squareIcoColor;
        }

        public String getRectangle1Image() {
            return rectangle1Image;
        }

        public void setRectangle1Image(String rectangle1Image) {
            this.rectangle1Image = rectangle1Image;
        }

        public String getRectangle1Type() {
            return rectangle1Type;
        }

        public void setRectangle1Type(String rectangle1Type) {
            this.rectangle1Type = rectangle1Type;
        }

        public String getRectangle1Data() {
            return rectangle1Data;
        }

        public void setRectangle1Data(String rectangle1Data) {
            this.rectangle1Data = rectangle1Data;
        }

        public String getRectangle1IcoName() {
            return rectangle1IcoName;
        }

        public void setRectangle1IcoName(String rectangle1IcoName) {
            this.rectangle1IcoName = rectangle1IcoName;
        }

        public String getRectangle1IcoColor() {
            return rectangle1IcoColor;
        }

        public void setRectangle1IcoColor(String rectangle1IcoColor) {
            this.rectangle1IcoColor = rectangle1IcoColor;
        }

        public String getRectangle2Image() {
            return rectangle2Image;
        }

        public void setRectangle2Image(String rectangle2Image) {
            this.rectangle2Image = rectangle2Image;
        }

        public String getRectangle2Type() {
            return rectangle2Type;
        }

        public void setRectangle2Type(String rectangle2Type) {
            this.rectangle2Type = rectangle2Type;
        }

        public String getRectangle2Data() {
            return rectangle2Data;
        }

        public void setRectangle2Data(String rectangle2Data) {
            this.rectangle2Data = rectangle2Data;
        }

        public String getRectangle2IcoName() {
            return rectangle2IcoName;
        }

        public void setRectangle2IcoName(String rectangle2IcoName) {
            this.rectangle2IcoName = rectangle2IcoName;
        }

        public String getRectangle2IcoColor() {
            return rectangle2IcoColor;
        }

        public void setRectangle2IcoColor(String rectangle2IcoColor) {
            this.rectangle2IcoColor = rectangle2IcoColor;
        }

        public String getRectangle3Image() {
            return rectangle3Image;
        }

        public void setRectangle3Image(String rectangle3Image) {
            this.rectangle3Image = rectangle3Image;
        }

        public String getRectangle3Type() {
            return rectangle3Type;
        }

        public void setRectangle3Type(String rectangle3Type) {
            this.rectangle3Type = rectangle3Type;
        }

        public String getRectangle3Data() {
            return rectangle3Data;
        }

        public void setRectangle3Data(String rectangle3Data) {
            this.rectangle3Data = rectangle3Data;
        }

        public String getRectangle3IcoName() {
            return rectangle3IcoName;
        }

        public void setRectangle3IcoName(String rectangle3IcoName) {
            this.rectangle3IcoName = rectangle3IcoName;
        }

        public String getRectangle3IcoColor() {
            return rectangle3IcoColor;
        }

        public void setRectangle3IcoColor(String rectangle3IcoColor) {
            this.rectangle3IcoColor = rectangle3IcoColor;
        }

        public String getRectangle4Image() {
            return rectangle4Image;
        }

        public void setRectangle4Image(String rectangle4Image) {
            this.rectangle4Image = rectangle4Image;
        }

        public String getRectangle4Type() {
            return rectangle4Type;
        }

        public void setRectangle4Type(String rectangle4Type) {
            this.rectangle4Type = rectangle4Type;
        }

        public String getRectangle4Data() {
            return rectangle4Data;
        }

        public void setRectangle4Data(String rectangle4Data) {
            this.rectangle4Data = rectangle4Data;
        }

        public String getRectangle4IcoName() {
            return rectangle4IcoName;
        }

        public void setRectangle4IcoName(String rectangle4IcoName) {
            this.rectangle4IcoName = rectangle4IcoName;
        }

        public String getRectangle4IcoColor() {
            return rectangle4IcoColor;
        }

        public void setRectangle4IcoColor(String rectangle4IcoColor) {
            this.rectangle4IcoColor = rectangle4IcoColor;
        }

        public String getRectangle5Image() {
            return rectangle5Image;
        }

        public void setRectangle5Image(String rectangle5Image) {
            this.rectangle5Image = rectangle5Image;
        }

        public String getRectangle5Type() {
            return rectangle5Type;
        }

        public void setRectangle5Type(String rectangle5Type) {
            this.rectangle5Type = rectangle5Type;
        }

        public String getRectangle5Data() {
            return rectangle5Data;
        }

        public void setRectangle5Data(String rectangle5Data) {
            this.rectangle5Data = rectangle5Data;
        }

        public String getRectangle5IcoName() {
            return rectangle5IcoName;
        }

        public void setRectangle5IcoName(String rectangle5IcoName) {
            this.rectangle5IcoName = rectangle5IcoName;
        }

        public String getRectangle5IcoColor() {
            return rectangle5IcoColor;
        }

        public void setRectangle5IcoColor(String rectangle5IcoColor) {
            this.rectangle5IcoColor = rectangle5IcoColor;
        }

        public String getRectangle6Image() {
            return rectangle6Image;
        }

        public void setRectangle6Image(String rectangle6Image) {
            this.rectangle6Image = rectangle6Image;
        }

        public String getRectangle6Type() {
            return rectangle6Type;
        }

        public void setRectangle6Type(String rectangle6Type) {
            this.rectangle6Type = rectangle6Type;
        }

        public String getRectangle6Data() {
            return rectangle6Data;
        }

        public void setRectangle6Data(String rectangle6Data) {
            this.rectangle6Data = rectangle6Data;
        }

        public String getRectangle6IcoName() {
            return rectangle6IcoName;
        }

        public void setRectangle6IcoName(String rectangle6IcoName) {
            this.rectangle6IcoName = rectangle6IcoName;
        }

        public String getRectangle6IcoColor() {
            return rectangle6IcoColor;
        }

        public void setRectangle6IcoColor(String rectangle6IcoColor) {
            this.rectangle6IcoColor = rectangle6IcoColor;
        }

        public String getRectangle7Image() {
            return rectangle7Image;
        }

        public void setRectangle7Image(String rectangle7Image) {
            this.rectangle7Image = rectangle7Image;
        }

        public String getRectangle7Type() {
            return rectangle7Type;
        }

        public void setRectangle7Type(String rectangle7Type) {
            this.rectangle7Type = rectangle7Type;
        }

        public String getRectangle7Data() {
            return rectangle7Data;
        }

        public void setRectangle7Data(String rectangle7Data) {
            this.rectangle7Data = rectangle7Data;
        }

        public String getRectangle7IcoName() {
            return rectangle7IcoName;
        }

        public void setRectangle7IcoName(String rectangle7IcoName) {
            this.rectangle7IcoName = rectangle7IcoName;
        }

        public String getRectangle7IcoColor() {
            return rectangle7IcoColor;
        }

        public void setRectangle7IcoColor(String rectangle7IcoColor) {
            this.rectangle7IcoColor = rectangle7IcoColor;
        }

        public String getRectangle8Image() {
            return rectangle8Image;
        }

        public void setRectangle8Image(String rectangle8Image) {
            this.rectangle8Image = rectangle8Image;
        }

        public String getRectangle8Type() {
            return rectangle8Type;
        }

        public void setRectangle8Type(String rectangle8Type) {
            this.rectangle8Type = rectangle8Type;
        }

        public String getRectangle8Data() {
            return rectangle8Data;
        }

        public void setRectangle8Data(String rectangle8Data) {
            this.rectangle8Data = rectangle8Data;
        }

        public String getRectangle8IcoName() {
            return rectangle8IcoName;
        }

        public void setRectangle8IcoName(String rectangle8IcoName) {
            this.rectangle8IcoName = rectangle8IcoName;
        }

        public String getRectangle8IcoColor() {
            return rectangle8IcoColor;
        }

        public void setRectangle8IcoColor(String rectangle8IcoColor) {
            this.rectangle8IcoColor = rectangle8IcoColor;
        }

        public String getRectangle9Image() {
            return rectangle9Image;
        }

        public void setRectangle9Image(String rectangle9Image) {
            this.rectangle9Image = rectangle9Image;
        }

        public String getRectangle9Type() {
            return rectangle9Type;
        }

        public void setRectangle9Type(String rectangle9Type) {
            this.rectangle9Type = rectangle9Type;
        }

        public String getRectangle9Data() {
            return rectangle9Data;
        }

        public void setRectangle9Data(String rectangle9Data) {
            this.rectangle9Data = rectangle9Data;
        }

        public String getRectangle9IcoName() {
            return rectangle9IcoName;
        }

        public void setRectangle9IcoName(String rectangle9IcoName) {
            this.rectangle9IcoName = rectangle9IcoName;
        }

        public String getRectangle9IcoColor() {
            return rectangle9IcoColor;
        }

        public void setRectangle9IcoColor(String rectangle9IcoColor) {
            this.rectangle9IcoColor = rectangle9IcoColor;
        }

    }

    public static class Home1Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("image")
        private String image = "";
        @SerializedName("type")
        private String type = "";
        @SerializedName("data")
        private String data = "";

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

    }

    public static class Home2Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("square_image")
        private String squareImage = "";
        @SerializedName("square_type")
        private String squareType = "";
        @SerializedName("square_data")
        private String squareData = "";
        @SerializedName("rectangle1_image")
        private String rectangle1Image = "";
        @SerializedName("rectangle1_type")
        private String rectangle1Type = "";
        @SerializedName("rectangle1_data")
        private String rectangle1Data = "";
        @SerializedName("rectangle2_image")
        private String rectangle2Image = "";
        @SerializedName("rectangle2_type")
        private String rectangle2Type = "";
        @SerializedName("rectangle2_data")
        private String rectangle2Data = "";

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSquareImage() {
            return squareImage;
        }

        public void setSquareImage(String squareImage) {
            this.squareImage = squareImage;
        }

        public String getSquareType() {
            return squareType;
        }

        public void setSquareType(String squareType) {
            this.squareType = squareType;
        }

        public String getSquareData() {
            return squareData;
        }

        public void setSquareData(String squareData) {
            this.squareData = squareData;
        }

        public String getRectangle1Image() {
            return rectangle1Image;
        }

        public void setRectangle1Image(String rectangle1Image) {
            this.rectangle1Image = rectangle1Image;
        }

        public String getRectangle1Type() {
            return rectangle1Type;
        }

        public void setRectangle1Type(String rectangle1Type) {
            this.rectangle1Type = rectangle1Type;
        }

        public String getRectangle1Data() {
            return rectangle1Data;
        }

        public void setRectangle1Data(String rectangle1Data) {
            this.rectangle1Data = rectangle1Data;
        }

        public String getRectangle2Image() {
            return rectangle2Image;
        }

        public void setRectangle2Image(String rectangle2Image) {
            this.rectangle2Image = rectangle2Image;
        }

        public String getRectangle2Type() {
            return rectangle2Type;
        }

        public void setRectangle2Type(String rectangle2Type) {
            this.rectangle2Type = rectangle2Type;
        }

        public String getRectangle2Data() {
            return rectangle2Data;
        }

        public void setRectangle2Data(String rectangle2Data) {
            this.rectangle2Data = rectangle2Data;
        }

    }

    public static class Home4Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("rectangle1_image")
        private String rectangle1Image = "";
        @SerializedName("rectangle1_type")
        private String rectangle1Type = "";
        @SerializedName("rectangle1_data")
        private String rectangle1Data = "";
        @SerializedName("rectangle2_image")
        private String rectangle2Image = "";
        @SerializedName("rectangle2_type")
        private String rectangle2Type = "";
        @SerializedName("rectangle2_data")
        private String rectangle2Data = "";
        @SerializedName("square_image")
        private String squareImage = "";
        @SerializedName("square_type")
        private String squareType = "";
        @SerializedName("square_data")
        private String squareData = "";

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getRectangle1Image() {
            return rectangle1Image;
        }

        public void setRectangle1Image(String rectangle1Image) {
            this.rectangle1Image = rectangle1Image;
        }

        public String getRectangle1Type() {
            return rectangle1Type;
        }

        public void setRectangle1Type(String rectangle1Type) {
            this.rectangle1Type = rectangle1Type;
        }

        public String getRectangle1Data() {
            return rectangle1Data;
        }

        public void setRectangle1Data(String rectangle1Data) {
            this.rectangle1Data = rectangle1Data;
        }

        public String getRectangle2Image() {
            return rectangle2Image;
        }

        public void setRectangle2Image(String rectangle2Image) {
            this.rectangle2Image = rectangle2Image;
        }

        public String getRectangle2Type() {
            return rectangle2Type;
        }

        public void setRectangle2Type(String rectangle2Type) {
            this.rectangle2Type = rectangle2Type;
        }

        public String getRectangle2Data() {
            return rectangle2Data;
        }

        public void setRectangle2Data(String rectangle2Data) {
            this.rectangle2Data = rectangle2Data;
        }

        public String getSquareImage() {
            return squareImage;
        }

        public void setSquareImage(String squareImage) {
            this.squareImage = squareImage;
        }

        public String getSquareType() {
            return squareType;
        }

        public void setSquareType(String squareType) {
            this.squareType = squareType;
        }

        public String getSquareData() {
            return squareData;
        }

        public void setSquareData(String squareData) {
            this.squareData = squareData;
        }

    }

    public static class Home3Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("item")
        private ArrayList<ItemBean> item = new ArrayList<>();

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ArrayList<ItemBean> getItem() {
            return item;
        }

        public void setItem(ArrayList<ItemBean> item) {
            this.item = item;
        }

        public static class ItemBean {

            @SerializedName("image")
            private String image = "";
            @SerializedName("type")
            private String type = "";
            @SerializedName("data")
            private String data = "";

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

        }

    }

    public static class Home5Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("stitle")
        private String stitle = "";
        @SerializedName("lcurl")
        private String lcurl = "";
        @SerializedName("square_image")
        private String squareImage = "";
        @SerializedName("square_type")
        private String squareType = "";
        @SerializedName("square_data")
        private String squareData = "";
        @SerializedName("rectangle1_image")
        private String rectangle1Image = "";
        @SerializedName("rectangle1_type")
        private String rectangle1Type = "";
        @SerializedName("rectangle1_data")
        private String rectangle1Data = "";
        @SerializedName("rectangle2_image")
        private String rectangle2Image = "";
        @SerializedName("rectangle2_type")
        private String rectangle2Type = "";
        @SerializedName("rectangle2_data")
        private String rectangle2Data = "";
        @SerializedName("rectangle3_image")
        private String rectangle3Image = "";
        @SerializedName("rectangle3_type")
        private String rectangle3Type = "";
        @SerializedName("rectangle3_data")
        private String rectangle3Data = "";

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getStitle() {
            return stitle;
        }

        public void setStitle(String stitle) {
            this.stitle = stitle;
        }

        public String getLcurl() {
            return lcurl;
        }

        public void setLcurl(String lcurl) {
            this.lcurl = lcurl;
        }

        public String getSquareImage() {
            return squareImage;
        }

        public void setSquareImage(String squareImage) {
            this.squareImage = squareImage;
        }

        public String getSquareType() {
            return squareType;
        }

        public void setSquareType(String squareType) {
            this.squareType = squareType;
        }

        public String getSquareData() {
            return squareData;
        }

        public void setSquareData(String squareData) {
            this.squareData = squareData;
        }

        public String getRectangle1Image() {
            return rectangle1Image;
        }

        public void setRectangle1Image(String rectangle1Image) {
            this.rectangle1Image = rectangle1Image;
        }

        public String getRectangle1Type() {
            return rectangle1Type;
        }

        public void setRectangle1Type(String rectangle1Type) {
            this.rectangle1Type = rectangle1Type;
        }

        public String getRectangle1Data() {
            return rectangle1Data;
        }

        public void setRectangle1Data(String rectangle1Data) {
            this.rectangle1Data = rectangle1Data;
        }

        public String getRectangle2Image() {
            return rectangle2Image;
        }

        public void setRectangle2Image(String rectangle2Image) {
            this.rectangle2Image = rectangle2Image;
        }

        public String getRectangle2Type() {
            return rectangle2Type;
        }

        public void setRectangle2Type(String rectangle2Type) {
            this.rectangle2Type = rectangle2Type;
        }

        public String getRectangle2Data() {
            return rectangle2Data;
        }

        public void setRectangle2Data(String rectangle2Data) {
            this.rectangle2Data = rectangle2Data;
        }

        public String getRectangle3Image() {
            return rectangle3Image;
        }

        public void setRectangle3Image(String rectangle3Image) {
            this.rectangle3Image = rectangle3Image;
        }

        public String getRectangle3Type() {
            return rectangle3Type;
        }

        public void setRectangle3Type(String rectangle3Type) {
            this.rectangle3Type = rectangle3Type;
        }

        public String getRectangle3Data() {
            return rectangle3Data;
        }

        public void setRectangle3Data(String rectangle3Data) {
            this.rectangle3Data = rectangle3Data;
        }

    }

    public static class Home6Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("square_image")
        private String squareImage = "";
        @SerializedName("square_type")
        private String squareType = "";
        @SerializedName("square_data")
        private String squareData = "";
        @SerializedName("rectangle1_image")
        private String rectangle1Image = "";
        @SerializedName("rectangle1_type")
        private String rectangle1Type = "";
        @SerializedName("rectangle1_data")
        private String rectangle1Data = "";
        @SerializedName("rectangle2_image")
        private String rectangle2Image = "";
        @SerializedName("rectangle2_type")
        private String rectangle2Type = "";
        @SerializedName("rectangle2_data")
        private String rectangle2Data = "";

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSquareImage() {
            return squareImage;
        }

        public void setSquareImage(String squareImage) {
            this.squareImage = squareImage;
        }

        public String getSquareType() {
            return squareType;
        }

        public void setSquareType(String squareType) {
            this.squareType = squareType;
        }

        public String getSquareData() {
            return squareData;
        }

        public void setSquareData(String squareData) {
            this.squareData = squareData;
        }

        public String getRectangle1Image() {
            return rectangle1Image;
        }

        public void setRectangle1Image(String rectangle1Image) {
            this.rectangle1Image = rectangle1Image;
        }

        public String getRectangle1Type() {
            return rectangle1Type;
        }

        public void setRectangle1Type(String rectangle1Type) {
            this.rectangle1Type = rectangle1Type;
        }

        public String getRectangle1Data() {
            return rectangle1Data;
        }

        public void setRectangle1Data(String rectangle1Data) {
            this.rectangle1Data = rectangle1Data;
        }

        public String getRectangle2Image() {
            return rectangle2Image;
        }

        public void setRectangle2Image(String rectangle2Image) {
            this.rectangle2Image = rectangle2Image;
        }

        public String getRectangle2Type() {
            return rectangle2Type;
        }

        public void setRectangle2Type(String rectangle2Type) {
            this.rectangle2Type = rectangle2Type;
        }

        public String getRectangle2Data() {
            return rectangle2Data;
        }

        public void setRectangle2Data(String rectangle2Data) {
            this.rectangle2Data = rectangle2Data;
        }

    }

    public static class Home8Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("square_image")
        private String squareImage = "";
        @SerializedName("square_type")
        private String squareType = "";
        @SerializedName("square_data")
        private String squareData = "";
        @SerializedName("square_ico_name")
        private String squareIcoName = "";
        @SerializedName("rectangle1_image")
        private String rectangle1Image = "";
        @SerializedName("rectangle1_type")
        private String rectangle1Type = "";
        @SerializedName("rectangle1_data")
        private String rectangle1Data = "";
        @SerializedName("rectangle1_ico_name")
        private String rectangle1IcoName = "";
        @SerializedName("rectangle2_image")
        private String rectangle2Image = "";
        @SerializedName("rectangle2_type")
        private String rectangle2Type = "";
        @SerializedName("rectangle2_data")
        private String rectangle2Data = "";
        @SerializedName("rectangle2_ico_name")
        private String rectangle2IcoName = "";
        @SerializedName("rectangle3_image")
        private String rectangle3Image = "";
        @SerializedName("rectangle3_type")
        private String rectangle3Type = "";
        @SerializedName("rectangle3_data")
        private String rectangle3Data = "";
        @SerializedName("rectangle3_ico_name")
        private String rectangle3IcoName = "";

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSquareImage() {
            return squareImage;
        }

        public void setSquareImage(String squareImage) {
            this.squareImage = squareImage;
        }

        public String getSquareType() {
            return squareType;
        }

        public void setSquareType(String squareType) {
            this.squareType = squareType;
        }

        public String getSquareData() {
            return squareData;
        }

        public void setSquareData(String squareData) {
            this.squareData = squareData;
        }

        public String getSquareIcoName() {
            return squareIcoName;
        }

        public void setSquareIcoName(String squareIcoName) {
            this.squareIcoName = squareIcoName;
        }

        public String getRectangle1Image() {
            return rectangle1Image;
        }

        public void setRectangle1Image(String rectangle1Image) {
            this.rectangle1Image = rectangle1Image;
        }

        public String getRectangle1Type() {
            return rectangle1Type;
        }

        public void setRectangle1Type(String rectangle1Type) {
            this.rectangle1Type = rectangle1Type;
        }

        public String getRectangle1Data() {
            return rectangle1Data;
        }

        public void setRectangle1Data(String rectangle1Data) {
            this.rectangle1Data = rectangle1Data;
        }

        public String getRectangle1IcoName() {
            return rectangle1IcoName;
        }

        public void setRectangle1IcoName(String rectangle1IcoName) {
            this.rectangle1IcoName = rectangle1IcoName;
        }

        public String getRectangle2Image() {
            return rectangle2Image;
        }

        public void setRectangle2Image(String rectangle2Image) {
            this.rectangle2Image = rectangle2Image;
        }

        public String getRectangle2Type() {
            return rectangle2Type;
        }

        public void setRectangle2Type(String rectangle2Type) {
            this.rectangle2Type = rectangle2Type;
        }

        public String getRectangle2Data() {
            return rectangle2Data;
        }

        public void setRectangle2Data(String rectangle2Data) {
            this.rectangle2Data = rectangle2Data;
        }

        public String getRectangle2IcoName() {
            return rectangle2IcoName;
        }

        public void setRectangle2IcoName(String rectangle2IcoName) {
            this.rectangle2IcoName = rectangle2IcoName;
        }

        public String getRectangle3Image() {
            return rectangle3Image;
        }

        public void setRectangle3Image(String rectangle3Image) {
            this.rectangle3Image = rectangle3Image;
        }

        public String getRectangle3Type() {
            return rectangle3Type;
        }

        public void setRectangle3Type(String rectangle3Type) {
            this.rectangle3Type = rectangle3Type;
        }

        public String getRectangle3Data() {
            return rectangle3Data;
        }

        public void setRectangle3Data(String rectangle3Data) {
            this.rectangle3Data = rectangle3Data;
        }

        public String getRectangle3IcoName() {
            return rectangle3IcoName;
        }

        public void setRectangle3IcoName(String rectangle3IcoName) {
            this.rectangle3IcoName = rectangle3IcoName;
        }

    }

    public static class Goods1Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("item")
        private ArrayList<ItemBean> item = new ArrayList<>();

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ArrayList<ItemBean> getItem() {
            return item;
        }

        public void setItem(ArrayList<ItemBean> item) {
            this.item = item;
        }

        public static class ItemBean {

            @SerializedName("xianshi_goods_id")
            private String xianshiGoodsId = "";
            @SerializedName("xianshi_id")
            private String xianshiId = "";
            @SerializedName("xianshi_name")
            private String xianshiName = "";
            @SerializedName("xianshi_title")
            private String xianshiTitle = "";
            @SerializedName("xianshi_explain")
            private String xianshiExplain = "";
            @SerializedName("goods_id")
            private String goodsId = "";
            @SerializedName("store_id")
            private String storeId = "";
            @SerializedName("goods_name")
            private String goodsName = "";
            @SerializedName("goods_price")
            private String goodsPrice = "";
            @SerializedName("xianshi_price")
            private String xianshiPrice = "";
            @SerializedName("goods_image")
            private String goodsImage = "";
            @SerializedName("start_time")
            private String startTime = "";
            @SerializedName("end_time")
            private String endTime = "";
            @SerializedName("lower_limit")
            private String lowerLimit = "";
            @SerializedName("state")
            private String state = "";
            @SerializedName("xianshi_recommend")
            private String xianshiRecommend = "";
            @SerializedName("gc_id_1")
            private String gcId1 = "";
            @SerializedName("time")
            private String time = "";

            public String getXianshiGoodsId() {
                return xianshiGoodsId;
            }

            public void setXianshiGoodsId(String xianshiGoodsId) {
                this.xianshiGoodsId = xianshiGoodsId;
            }

            public String getXianshiId() {
                return xianshiId;
            }

            public void setXianshiId(String xianshiId) {
                this.xianshiId = xianshiId;
            }

            public String getXianshiName() {
                return xianshiName;
            }

            public void setXianshiName(String xianshiName) {
                this.xianshiName = xianshiName;
            }

            public String getXianshiTitle() {
                return xianshiTitle;
            }

            public void setXianshiTitle(String xianshiTitle) {
                this.xianshiTitle = xianshiTitle;
            }

            public String getXianshiExplain() {
                return xianshiExplain;
            }

            public void setXianshiExplain(String xianshiExplain) {
                this.xianshiExplain = xianshiExplain;
            }

            public String getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(String goodsId) {
                this.goodsId = goodsId;
            }

            public String getStoreId() {
                return storeId;
            }

            public void setStoreId(String storeId) {
                this.storeId = storeId;
            }

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }

            public String getGoodsPrice() {
                return goodsPrice;
            }

            public void setGoodsPrice(String goodsPrice) {
                this.goodsPrice = goodsPrice;
            }

            public String getXianshiPrice() {
                return xianshiPrice;
            }

            public void setXianshiPrice(String xianshiPrice) {
                this.xianshiPrice = xianshiPrice;
            }

            public String getGoodsImage() {
                return goodsImage;
            }

            public void setGoodsImage(String goodsImage) {
                this.goodsImage = goodsImage;
            }

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getEndTime() {
                return endTime;
            }

            public void setEndTime(String endTime) {
                this.endTime = endTime;
            }

            public String getLowerLimit() {
                return lowerLimit;
            }

            public void setLowerLimit(String lowerLimit) {
                this.lowerLimit = lowerLimit;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getXianshiRecommend() {
                return xianshiRecommend;
            }

            public void setXianshiRecommend(String xianshiRecommend) {
                this.xianshiRecommend = xianshiRecommend;
            }

            public String getGcId1() {
                return gcId1;
            }

            public void setGcId1(String gcId1) {
                this.gcId1 = gcId1;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

        }

    }

    public static class Goods2Bean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("item")
        private ArrayList<ItemBean> item = new ArrayList<>();

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ArrayList<ItemBean> getItem() {
            return item;
        }

        public void setItem(ArrayList<ItemBean> item) {
            this.item = item;
        }

        public static class ItemBean {

            @SerializedName("goods_id")
            private String goodsId = "";
            @SerializedName("goods_name")
            private String goodsName = "";
            @SerializedName("goods_sale_price")
            private String goodsSalePrice = "";
            @SerializedName("goods_image")
            private String goodsImage = "";

            public String getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(String goodsId) {
                this.goodsId = goodsId;
            }

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }

            public String getGoodsSalePrice() {
                return goodsSalePrice;
            }

            public void setGoodsSalePrice(String goodsSalePrice) {
                this.goodsSalePrice = goodsSalePrice;
            }

            public String getGoodsImage() {
                return goodsImage;
            }

            public void setGoodsImage(String goodsImage) {
                this.goodsImage = goodsImage;
            }

        }

    }

    public static class GoodsBean {

        @SerializedName("title")
        private String title = "";
        @SerializedName("item")
        private ArrayList<ItemBean> item = new ArrayList<>();

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ArrayList<ItemBean> getItem() {
            return item;
        }

        public void setItem(ArrayList<ItemBean> item) {
            this.item = item;
        }

        public static class ItemBean {

            @SerializedName("goods_id")
            private String goodsId = "";
            @SerializedName("goods_name")
            private String goodsName = "";
            @SerializedName("goods_sale_price")
            private String goodsSalePrice = "";
            @SerializedName("goods_image")
            private String goodsImage = "";

            public String getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(String goodsId) {
                this.goodsId = goodsId;
            }

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }

            public String getGoodsSalePrice() {
                return goodsSalePrice;
            }

            public void setGoodsSalePrice(String goodsSalePrice) {
                this.goodsSalePrice = goodsSalePrice;
            }

            public String getGoodsImage() {
                return goodsImage;
            }

            public void setGoodsImage(String goodsImage) {
                this.goodsImage = goodsImage;
            }

        }

    }

}
