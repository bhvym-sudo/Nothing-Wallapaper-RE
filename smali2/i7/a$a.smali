.class public final Li7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/a;-><init>(LD3/c;Lt3/a;Landroidx/lifecycle/Q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/f;


# direct methods
.method public constructor <init>(LI8/f;)V
    .registers 2

    iput-object p1, p0, Li7/a$a;->q:LI8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 4

    iget-object p0, p0, Li7/a$a;->q:LI8/f;

    new-instance v0, Li7/a$a$a;

    invoke-direct {v0, p1}, Li7/a$a$a;-><init>(LI8/g;)V

    invoke-interface {p0, v0, p2}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_12

    return-object p0

    :cond_12
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
