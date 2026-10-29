.class public final synthetic LN7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/d0;


# instance fields
.field public final synthetic q:Lkotlin/jvm/internal/A;

.field public final synthetic r:Landroidx/lifecycle/q;

.field public final synthetic s:LN7/f$a;

.field public final synthetic t:Lkotlin/jvm/internal/E;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/A;Landroidx/lifecycle/q;LN7/f$a;Lkotlin/jvm/internal/E;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN7/a;->q:Lkotlin/jvm/internal/A;

    iput-object p2, p0, LN7/a;->r:Landroidx/lifecycle/q;

    iput-object p3, p0, LN7/a;->s:LN7/f$a;

    iput-object p4, p0, LN7/a;->t:Lkotlin/jvm/internal/E;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .registers 4

    iget-object v0, p0, LN7/a;->q:Lkotlin/jvm/internal/A;

    iget-object v1, p0, LN7/a;->r:Landroidx/lifecycle/q;

    iget-object v2, p0, LN7/a;->s:LN7/f$a;

    iget-object p0, p0, LN7/a;->t:Lkotlin/jvm/internal/E;

    invoke-static {v0, v1, v2, p0}, LN7/f;->e(Lkotlin/jvm/internal/A;Landroidx/lifecycle/q;LN7/f$a;Lkotlin/jvm/internal/E;)V

    return-void
.end method
