看视频学习 youtub
这个是代码
https://github.com/bimalkaf/Android_Basics_Features/tree/main/RecyclerViewDemo
代码下面可以跳转youtub教学
1.添加依赖在gradle
java和kotlin都可以
implementation 'androidx.recyclerview:recyclerview:1.3.2'
2.在创建布局文件：recyle控件 （在acit或者frag布局里面）
3.单个项目实体
4.单个项目布局
5.创建自定义ViewHolder
绑定 单个item布局视图（）
代码结构
1.继承 RecyclerView.ViewHolde  然后快捷建构造函数
2.声明要用到的成员变量
3.初始化这些控件。
 onBindViewHolder()  里面 可以直接用这些变量更新界面数据  
public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView,emailView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        emailView = itemView.findViewById(R.id.email);
    }
}
6.创建Adapter 
代码结构
1.继承RecyclerView.Adapter
2.快捷键 那三个
3.够着函数 显示list和content
以上结构就出来了
4.onCreateViewHolder里面填写
●  item布局只是蓝图，不能直接显示， LayoutInflater 的工作，就是把这个蓝图“吹气”，
变成屏幕上真的能显示的东西。  
●  from(context)  在那个界面
●  .inflate(R.layout.item_view, parent, false)  ， 根据蓝图（item_view.xml），造出一个完整的 item 界面  
●  new MyViewHolder(...)    帮你把刚才造出来的那行界面装起来  
代码：
 return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
5.onBindViewHolder里面填写
●  把列表里第 position 个数据，放到对应的 ViewHolder（那一行界面）上  
● 反正就是创好了视图，就把对应数据填进去的意思
6.getItemCount
●  return items.size();
上面是布局和传递数据的逻辑准备
接下来 就是在mainactivtiy里面
7.在显示的界面写 逻辑
逻辑
1.找到这个recview控件
RecyclerView recyclerView = findViewById(R.id.recyclerview);
● 左边的 recyclerView 是变量名，你在代码里操作这个控件的时候就用它。
● 右边的 R.id.recyclerview 是 XML 里控件的 id，对应你的布局文件里写的：
2. 给 RecyclerView 配个‘竖着排队’的管理员   ，决定怎么排队  (recyclerView布局管理器)
recyclerView.setLayoutManager(new LinearLayoutManager(this));
这个默认是竖着排队
如果横着排
recyclerView.setLayoutManager(
    new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
);
三个参数解释：

this：当前的上下文环境，告诉系统“在哪个界面用”。

LinearLayoutManager.HORIZONTAL：方向改成水平。

false：是否反转顺序。

false：从左往右滑（默认）。

true：从右往左滑。
3 设置适配器，setAdapter，把我自定义的 MyAdapter,决定展示什么内容  。
 recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
4.在items时候，要建一个列表，加一些数据在列表里面
List<Item> items = new ArrayList<Item>();
。。。。
