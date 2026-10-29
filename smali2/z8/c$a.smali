.class public final Lz8/c$a;
.super Lz8/c;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Lz8/c;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lz8/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()I
    .registers 1

    invoke-static {}, Lz8/c;->a()Lz8/c;

    move-result-object p0

    invoke-virtual {p0}, Lz8/c;->b()I

    move-result p0

    return p0
.end method

.method public c(I)I
    .registers 2

    invoke-static {}, Lz8/c;->a()Lz8/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lz8/c;->c(I)I

    move-result p0

    return p0
.end method
