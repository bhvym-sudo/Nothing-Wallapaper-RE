.class public final LW6/U$c;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/U;->A1(Le3/s;LT6/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW6/U;


# direct methods
.method constructor <init>(LW6/U;)V
    .registers 2

    iput-object p1, p0, LW6/U$c;->a:LW6/U;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 4

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_34

    iget-object p1, p0, LW6/U$c;->a:LW6/U;

    invoke-static {p1}, LW6/U;->r1(LW6/U;)LZ6/d;

    move-result-object p2

    invoke-virtual {p2}, LZ6/d;->l()I

    move-result p2

    invoke-static {p1, p2}, LW6/U;->x1(LW6/U;I)V

    iget-object p1, p0, LW6/U$c;->a:LW6/U;

    invoke-static {p1}, LW6/U;->s1(LW6/U;)I

    move-result p1

    if-gez p1, :cond_25

    iget-object p1, p0, LW6/U$c;->a:LW6/U;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LW6/U;->x1(LW6/U;I)V

    :cond_25
    iget-object p1, p0, LW6/U$c;->a:LW6/U;

    invoke-static {p1}, LW6/U;->t1(LW6/U;)La7/d;

    move-result-object p1

    iget-object p0, p0, LW6/U$c;->a:LW6/U;

    invoke-static {p0}, LW6/U;->s1(LW6/U;)I

    move-result p0

    invoke-virtual {p1, p0}, La7/d;->F0(I)V

    :cond_34
    return-void
.end method
