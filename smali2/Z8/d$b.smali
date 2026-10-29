.class public final LZ8/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/conscrypt/ConscryptHostnameVerifier;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LZ8/d$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LZ8/d$b;

    invoke-direct {v0}, LZ8/d$b;-><init>()V

    sput-object v0, LZ8/d$b;->a:LZ8/d$b;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
