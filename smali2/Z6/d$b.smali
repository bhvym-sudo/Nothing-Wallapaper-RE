.class public final LZ6/d$b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ6/d;-><init>(Landroidx/recyclerview/widget/SnapHelper;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LZ6/d;


# direct methods
.method constructor <init>(LZ6/d;)V
    .registers 2

    iput-object p1, p0, LZ6/d$b;->a:LZ6/d;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 5

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    if-eqz p2, :cond_31

    iget-object p1, p0, LZ6/d$b;->a:LZ6/d;

    invoke-static {p1}, LZ6/d;->g(LZ6/d;)Z

    move-result p1

    if-eqz p1, :cond_1d

    iget-object p1, p0, LZ6/d$b;->a:LZ6/d;

    invoke-static {p1}, LZ6/d;->e(LZ6/d;)I

    move-result p3

    sub-int/2addr p3, p2

    invoke-static {p1, p3}, LZ6/d;->h(LZ6/d;I)V

    goto :goto_27

    :cond_1d
    iget-object p1, p0, LZ6/d$b;->a:LZ6/d;

    invoke-static {p1}, LZ6/d;->e(LZ6/d;)I

    move-result p3

    add-int/2addr p3, p2

    invoke-static {p1, p3}, LZ6/d;->h(LZ6/d;I)V

    :goto_27
    iget-object p1, p0, LZ6/d$b;->a:LZ6/d;

    invoke-static {p1}, LZ6/d;->d(LZ6/d;)V

    iget-object p0, p0, LZ6/d$b;->a:LZ6/d;

    invoke-static {p0}, LZ6/d;->f(LZ6/d;)V

    :cond_31
    return-void
.end method
