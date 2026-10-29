.class final LE7/Z$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE7/Z;->s(Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:LE7/Z;

.field u:I


# direct methods
.method constructor <init>(LE7/Z;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LE7/Z$b;->t:LE7/Z;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, LE7/Z$b;->s:Ljava/lang/Object;

    iget p1, p0, LE7/Z$b;->u:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LE7/Z$b;->u:I

    iget-object p1, p0, LE7/Z$b;->t:LE7/Z;

    invoke-static {p1, p0}, LE7/Z;->g(LE7/Z;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
