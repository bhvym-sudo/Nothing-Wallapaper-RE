.class final LV6/a$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV6/a;->h(Landroid/content/Context;ZLjava/lang/String;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:LV6/a;

.field u:I


# direct methods
.method constructor <init>(LV6/a;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LV6/a$b;->t:LV6/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, LV6/a$b;->s:Ljava/lang/Object;

    iget p1, p0, LV6/a$b;->u:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LV6/a$b;->u:I

    iget-object p1, p0, LV6/a$b;->t:LV6/a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v0, p0}, LV6/a;->h(Landroid/content/Context;ZLjava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
