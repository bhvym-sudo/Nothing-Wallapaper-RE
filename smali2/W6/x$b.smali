.class public final LW6/x$b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/x;->o1(Le3/q;LT6/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW6/x;


# direct methods
.method constructor <init>(LW6/x;)V
    .registers 2

    iput-object p1, p0, LW6/x$b;->a:LW6/x;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 4

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_3d

    iget-object p1, p0, LW6/x$b;->a:LW6/x;

    invoke-static {p1}, LW6/x;->c1(LW6/x;)LZ6/d;

    move-result-object p2

    invoke-virtual {p2}, LZ6/d;->l()I

    move-result p2

    invoke-static {p1, p2}, LW6/x;->j1(LW6/x;I)V

    iget-object p1, p0, LW6/x$b;->a:LW6/x;

    invoke-static {p1}, LW6/x;->d1(LW6/x;)I

    move-result p1

    if-gez p1, :cond_25

    iget-object p1, p0, LW6/x$b;->a:LW6/x;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LW6/x;->j1(LW6/x;I)V

    :cond_25
    iget-object p1, p0, LW6/x$b;->a:LW6/x;

    invoke-static {p1}, LW6/x;->d1(LW6/x;)I

    move-result p2

    invoke-static {p1, p2}, LW6/x;->i1(LW6/x;I)V

    iget-object p1, p0, LW6/x$b;->a:LW6/x;

    invoke-static {p1}, LW6/x;->e1(LW6/x;)La7/d;

    move-result-object p1

    iget-object p0, p0, LW6/x$b;->a:LW6/x;

    invoke-static {p0}, LW6/x;->d1(LW6/x;)I

    move-result p0

    invoke-virtual {p1, p0}, La7/d;->H0(I)V

    :cond_3d
    return-void
.end method
