.class public final Lo6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo6/b$a;->a:I

    return-void
.end method


# virtual methods
.method public final a()Lo6/b;
    .registers 2

    new-instance v0, Lo6/b;

    iget p0, p0, Lo6/b$a;->a:I

    invoke-direct {v0, p0}, Lo6/b;-><init>(I)V

    return-object v0
.end method
