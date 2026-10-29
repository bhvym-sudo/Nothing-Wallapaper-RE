.class final LA6/b$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA6/b;->d(ILm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic A:Ljava/lang/Object;

.field final synthetic B:LA6/b;

.field C:I

.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:Ljava/lang/Object;

.field u:Ljava/lang/Object;

.field v:Ljava/lang/Object;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:J


# direct methods
.method constructor <init>(LA6/b;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LA6/b$a;->B:LA6/b;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, LA6/b$a;->A:Ljava/lang/Object;

    iget p1, p0, LA6/b$a;->C:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LA6/b$a;->C:I

    iget-object p1, p0, LA6/b$a;->B:LA6/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LA6/b;->d(ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
