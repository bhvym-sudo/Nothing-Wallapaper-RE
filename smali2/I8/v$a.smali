.class public final LI8/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/v;->a(LI8/f;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lkotlin/jvm/internal/E;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/E;)V
    .registers 2

    iput-object p1, p0, LI8/v$a;->q:Lkotlin/jvm/internal/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p2, p0, LI8/v$a;->q:Lkotlin/jvm/internal/E;

    iput-object p1, p2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    new-instance p1, LJ8/a;

    invoke-direct {p1, p0}, LJ8/a;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
