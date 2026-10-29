.class public final LD8/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;
.implements LD8/c;


# instance fields
.field private final a:LD8/h;

.field private final b:I


# direct methods
.method public constructor <init>(LD8/h;I)V
    .registers 4

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD8/u;->a:LD8/h;

    iput p2, p0, LD8/u;->b:I

    if-ltz p2, :cond_f

    return-void

    :cond_f
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "count must be non-negative, but was "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic c(LD8/u;)I
    .registers 1

    iget p0, p0, LD8/u;->b:I

    return p0
.end method

.method public static final synthetic d(LD8/u;)LD8/h;
    .registers 1

    iget-object p0, p0, LD8/u;->a:LD8/h;

    return-object p0
.end method


# virtual methods
.method public a(I)LD8/h;
    .registers 3

    iget v0, p0, LD8/u;->b:I

    if-lt p1, v0, :cond_5

    return-object p0

    :cond_5
    new-instance v0, LD8/u;

    iget-object p0, p0, LD8/u;->a:LD8/h;

    invoke-direct {v0, p0, p1}, LD8/u;-><init>(LD8/h;I)V

    return-object v0
.end method

.method public b(I)LD8/h;
    .registers 4

    iget v0, p0, LD8/u;->b:I

    if-lt p1, v0, :cond_9

    invoke-static {}, LD8/p;->g()LD8/h;

    move-result-object p0

    return-object p0

    :cond_9
    new-instance v1, LD8/t;

    iget-object p0, p0, LD8/u;->a:LD8/h;

    invoke-direct {v1, p0, p1, v0}, LD8/t;-><init>(LD8/h;II)V

    return-object v1
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 2

    new-instance v0, LD8/u$a;

    invoke-direct {v0, p0}, LD8/u$a;-><init>(LD8/u;)V

    return-object v0
.end method
