.class public final LB7/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB7/b;-><init>(Landroid/content/Context;LR2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/f;

.field final synthetic r:LB7/b;


# direct methods
.method public constructor <init>(LI8/f;LB7/b;)V
    .registers 3

    iput-object p1, p0, LB7/b$b;->q:LI8/f;

    iput-object p2, p0, LB7/b$b;->r:LB7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 5

    iget-object v0, p0, LB7/b$b;->q:LI8/f;

    new-instance v1, LB7/b$b$a;

    iget-object p0, p0, LB7/b$b;->r:LB7/b;

    invoke-direct {v1, p1, p0}, LB7/b$b$a;-><init>(LI8/g;LB7/b;)V

    invoke-interface {v0, v1, p2}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_14

    return-object p0

    :cond_14
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
