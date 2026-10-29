.class public final synthetic LT7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/widget/CategoryItemView;

.field public final synthetic r:Lv8/p;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/widget/CategoryItemView;Lv8/p;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT7/b;->q:Lcom/nothing/wallpaper/widget/CategoryItemView;

    iput-object p2, p0, LT7/b;->r:Lv8/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, LT7/b;->q:Lcom/nothing/wallpaper/widget/CategoryItemView;

    iget-object p0, p0, LT7/b;->r:Lv8/p;

    check-cast p1, Lg3/x;

    check-cast p2, Landroid/view/View;

    invoke-static {v0, p0, p1, p2}, Lcom/nothing/wallpaper/widget/CategoryItemView;->b(Lcom/nothing/wallpaper/widget/CategoryItemView;Lv8/p;Lg3/x;Landroid/view/View;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
