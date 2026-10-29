.class public final LM6/f;
.super LM6/a;
.source "SourceFile"


# instance fields
.field private final r:Lcom/nothing/wallpaper/widget/CategoryItemView;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/widget/CategoryItemView;Ljava/util/Set;Lv8/p;Z)V
    .registers 6

    const-string v0, "categoryView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appliedIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, LM6/a;-><init>(Landroid/view/View;)V

    .line 3
    iput-object p1, p0, LM6/f;->r:Lcom/nothing/wallpaper/widget/CategoryItemView;

    .line 4
    invoke-virtual {p1, p2, p4, p3}, Lcom/nothing/wallpaper/widget/CategoryItemView;->f(Ljava/util/Set;ZLv8/p;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/nothing/wallpaper/widget/CategoryItemView;Ljava/util/Set;Lv8/p;ZILkotlin/jvm/internal/h;)V
    .registers 7

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_5

    const/4 p4, 0x0

    .line 1
    :cond_5
    invoke-direct {p0, p1, p2, p3, p4}, LM6/f;-><init>(Lcom/nothing/wallpaper/widget/CategoryItemView;Ljava/util/Set;Lv8/p;Z)V

    return-void
.end method


# virtual methods
.method public d(Lg3/a;)V
    .registers 3

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LM6/a;->d(Lg3/a;)V

    iget-object p0, p0, LM6/f;->r:Lcom/nothing/wallpaper/widget/CategoryItemView;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/widget/CategoryItemView;->c(Lg3/a;)V

    return-void
.end method
