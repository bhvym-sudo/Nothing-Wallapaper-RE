.class public final LN7/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/f;->g(Landroidx/lifecycle/q;Lv8/l;)Lh8/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lkotlin/jvm/internal/A;

.field final synthetic r:Landroidx/lifecycle/q;

.field final synthetic s:Lkotlin/jvm/internal/E;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/A;Landroidx/lifecycle/q;Lkotlin/jvm/internal/E;)V
    .registers 4

    iput-object p1, p0, LN7/f$a;->q:Lkotlin/jvm/internal/A;

    iput-object p2, p0, LN7/f$a;->r:Landroidx/lifecycle/q;

    iput-object p3, p0, LN7/f$a;->s:Lkotlin/jvm/internal/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStateChanged(Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LN7/f$a;->q:Lkotlin/jvm/internal/A;

    iget-boolean v0, p1, Lkotlin/jvm/internal/A;->q:Z

    if-eqz v0, :cond_16

    iget-object p1, p0, LN7/f$a;->r:Landroidx/lifecycle/q;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/q;->d(Landroidx/lifecycle/w;)V

    return-void

    :cond_16
    sget-object v0, Landroidx/lifecycle/q$a;->ON_DESTROY:Landroidx/lifecycle/q$a;

    if-ne p2, v0, :cond_21

    iget-object p0, p0, LN7/f$a;->s:Lkotlin/jvm/internal/E;

    const-string p2, "lifecycle"

    invoke-static {p0, p1, p2}, LN7/f;->f(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/A;Ljava/lang/String;)V

    :cond_21
    return-void
.end method
