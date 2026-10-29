.class public final LG7/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/n;->a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;LJ7/i;LS1/a;LF8/L;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LJ7/i;


# direct methods
.method constructor <init>(LJ7/i;)V
    .registers 2

    iput-object p1, p0, LG7/n$a;->q:LJ7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LG7/n$a;->q:LJ7/i;

    invoke-virtual {v0}, LJ7/i;->n0()Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_37

    :cond_e
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LT1/a;

    if-eqz v0, :cond_19

    check-cast p1, LT1/a;

    goto :goto_1a

    :cond_19
    const/4 p1, 0x0

    :goto_1a
    if-nez p1, :cond_1d

    goto :goto_37

    :cond_1d
    iget-object v0, p0, LG7/n$a;->q:LJ7/i;

    invoke-virtual {p1}, LT1/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LJ7/i;->W0(Ljava/lang/String;)V

    sget-object v0, LA7/d;->a:LA7/d;

    invoke-virtual {p1}, LT1/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LA7/d;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_37

    iget-object p0, p0, LG7/n$a;->q:LJ7/i;

    invoke-virtual {p0}, LJ7/i;->t0()V

    :cond_37
    :goto_37
    return-void
.end method
