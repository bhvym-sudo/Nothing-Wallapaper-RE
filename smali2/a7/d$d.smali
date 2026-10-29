.class final La7/d$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La7/d;->G(LX6/d$b;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field synthetic t:Ljava/lang/Object;

.field final synthetic u:La7/d;

.field v:I


# direct methods
.method constructor <init>(La7/d;Lm8/e;)V
    .registers 3

    iput-object p1, p0, La7/d$d;->u:La7/d;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, La7/d$d;->t:Ljava/lang/Object;

    iget p1, p0, La7/d$d;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La7/d$d;->v:I

    iget-object p1, p0, La7/d$d;->u:La7/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, La7/d;->i(La7/d;LX6/d$b;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
