.class public final LI8/t$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/t;->b(LI8/f;Lv8/p;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/f;

.field final synthetic r:Lv8/p;


# direct methods
.method public constructor <init>(LI8/f;Lv8/p;)V
    .registers 3

    iput-object p1, p0, LI8/t$c;->q:LI8/f;

    iput-object p2, p0, LI8/t$c;->r:Lv8/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 6

    new-instance v0, Lkotlin/jvm/internal/A;

    invoke-direct {v0}, Lkotlin/jvm/internal/A;-><init>()V

    iget-object v1, p0, LI8/t$c;->q:LI8/f;

    new-instance v2, LI8/t$d;

    iget-object p0, p0, LI8/t$c;->r:Lv8/p;

    invoke-direct {v2, v0, p1, p0}, LI8/t$d;-><init>(Lkotlin/jvm/internal/A;LI8/g;Lv8/p;)V

    invoke-interface {v1, v2, p2}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_19

    return-object p0

    :cond_19
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
