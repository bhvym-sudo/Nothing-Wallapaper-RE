.class final LI8/r$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/r;->c(LI8/g;Lv8/q;Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field synthetic r:Ljava/lang/Object;

.field s:I


# direct methods
.method constructor <init>(Lm8/e;)V
    .registers 2

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, LI8/r$a;->r:Ljava/lang/Object;

    iget p1, p0, LI8/r$a;->s:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LI8/r$a;->s:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p0}, LI8/r;->a(LI8/g;Lv8/q;Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
