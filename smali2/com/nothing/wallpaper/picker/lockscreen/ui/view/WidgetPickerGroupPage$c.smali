.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$c;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

.field final synthetic b:Landroidx/recyclerview/widget/GridLayoutManager;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;Landroidx/recyclerview/widget/GridLayoutManager;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$c;->b:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->V(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)LF7/k;

    move-result-object v0

    invoke-virtual {v0, p1}, LF7/k;->d(I)Z

    move-result p1

    if-eqz p1, :cond_13

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$c;->b:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result p0

    return p0

    :cond_13
    const/4 p0, 0x1

    return p0
.end method
