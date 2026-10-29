.class public final Ls6/a$e$e;
.super Ls6/a$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls6/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final s:Z


# direct methods
.method public constructor <init>(Z)V
    .registers 6

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    .line 1
    invoke-direct {p0, v2, v3, v0, v1}, Ls6/a$e;-><init>(IZILkotlin/jvm/internal/h;)V

    iput-boolean p1, p0, Ls6/a$e$e;->s:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/h;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    .line 2
    :cond_5
    invoke-direct {p0, p1}, Ls6/a$e$e;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final i()Z
    .registers 1

    iget-boolean p0, p0, Ls6/a$e$e;->s:Z

    return p0
.end method
