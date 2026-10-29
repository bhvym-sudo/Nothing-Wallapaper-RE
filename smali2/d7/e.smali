.class public final synthetic Ld7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic q:Li7/d;

.field public final synthetic r:Landroid/content/Context;

.field public final synthetic s:Lkotlin/jvm/internal/E;


# direct methods
.method public synthetic constructor <init>(Li7/d;Landroid/content/Context;Lkotlin/jvm/internal/E;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/e;->q:Li7/d;

    iput-object p2, p0, Ld7/e;->r:Landroid/content/Context;

    iput-object p3, p0, Ld7/e;->s:Lkotlin/jvm/internal/E;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 5

    iget-object v0, p0, Ld7/e;->q:Li7/d;

    iget-object v1, p0, Ld7/e;->r:Landroid/content/Context;

    iget-object p0, p0, Ld7/e;->s:Lkotlin/jvm/internal/E;

    invoke-static {v0, v1, p0, p1, p2}, Ld7/l;->e(Li7/d;Landroid/content/Context;Lkotlin/jvm/internal/E;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V

    return-void
.end method
