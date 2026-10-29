.class public final LI8/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/t;->a(LI8/f;I)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/f;

.field final synthetic r:I


# direct methods
.method public constructor <init>(LI8/f;I)V
    .registers 3

    iput-object p1, p0, LI8/t$a;->q:LI8/f;

    iput p2, p0, LI8/t$a;->r:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 6

    new-instance v0, Lkotlin/jvm/internal/C;

    invoke-direct {v0}, Lkotlin/jvm/internal/C;-><init>()V

    iget-object v1, p0, LI8/t$a;->q:LI8/f;

    new-instance v2, LI8/t$b;

    iget p0, p0, LI8/t$a;->r:I

    invoke-direct {v2, v0, p0, p1}, LI8/t$b;-><init>(Lkotlin/jvm/internal/C;ILI8/g;)V

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
