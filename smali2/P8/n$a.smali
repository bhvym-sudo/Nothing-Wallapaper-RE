.class public final LP8/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/n$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:LP8/n$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LP8/n$a;

    invoke-direct {v0}, LP8/n$a;-><init>()V

    sput-object v0, LP8/n$a;->a:LP8/n$a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
